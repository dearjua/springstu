package com.dearjua.spring.core;


import com.dearjua.spring.core.Annotation.Bean;

import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashMap;

public class AnnotationApplicationContext implements ApplicationContext {

    //存储bean的容器
    private static HashMap<Class, Object> beanFactory = new HashMap<>();
    private static String rootPath;

    @Override
    public Object getBean(Class clazz) {
        return beanFactory.get(clazz);
    }

    /**
     * 根据包扫描加载bean
     * @param basePackage
     */
    public AnnotationApplicationContext(String basePackage) {
        try {
            //把.替换成\
            String packageDirName = basePackage.replaceAll("\\.", "\\\\");
            //获取.clss文件的绝对路径
            //Enumeration<URL> dirs枚举对象
            Enumeration<URL> dirs =Thread.currentThread().getContextClassLoader().getResources(packageDirName);
            //遍历枚举对象
            while (dirs.hasMoreElements()) {
                URL url = dirs.nextElement();
                String filePath = URLDecoder.decode(url.getFile(),"utf-8");
                rootPath = filePath.substring(0, filePath.length()-packageDirName.length());
                loadBean(new File(filePath));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /*private  void loadBean(File fileParent) {
        if (fileParent.isDirectory()) {
            File[] childrenFiles = fileParent.listFiles();
            if(childrenFiles == null || childrenFiles.length == 0){
                return;
            }
            for (File child : childrenFiles) {
                if (child.isDirectory()) {
                    //如果是个文件夹就继续调用该方法,使用了递归
                    loadBean(child);
                } else {
                    //通过文件路径转变成全类名,第一步把绝对路径部分去掉
                    String pathWithClass = child.getAbsolutePath().substring(rootPath.length() - 1);
                    //选中class文件
                    if (pathWithClass.contains(".class")) {
                        //    com.xinzhi.dao.UserDao
                        //去掉.class后缀，并且把 \ 替换成 .
                        String fullName = pathWithClass.replaceAll("\\\\", ".").replace(".class", "");
                        try {
                            Class<?> aClass = Class.forName(fullName);
                            //把非接口的类实例化放在map中
                            if(!aClass.isInterface()){
                                Bean annotation = aClass.getAnnotation(Bean.class);
                                if(annotation != null){
                                    Object instance = aClass.newInstance();
                                    //判断一下有没有接口
                                    if(aClass.getInterfaces().length > 0) {
                                        //如果有接口把接口的class当成key，实例对象当成value
                                        System.out.println("正在加载【"+ aClass.getInterfaces()[0] +"】,实例对象是：" + instance.getClass().getName());
                                        beanFactory.put(aClass.getInterfaces()[0], instance);
                                    }else{
                                        //如果没有接口把自己的class当成key，实例对象当成value
                                        System.out.println("正在加载【"+ aClass.getName() +"】,实例对象是：" + instance.getClass().getName());
                                        beanFactory.put(aClass, instance);
                                    }
                                }
                            }
                        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }*/

    public static void loadBean(File file) throws ClassNotFoundException {
        //1.判断当前是否是文件夹
        if (file.isDirectory()) {
            //2.获取文件夹中的所有内容
            File[] childFiles = file.listFiles();
            //3.判断文件夹里面为空，直接返回
            if(childFiles == null || childFiles.length == 0){
                return;
            }
            //4  如果不为空遍历文件夹所有内容
            for (File file1 : childFiles){
                //4.1 得到每个file对象，继续判断，如果是文件夹，递归
                if (file1.isDirectory()){
                    loadBean(file1);
                }else{
                    //4.2 遍历得到的file对象不是文件夹，是文件
                    //4.3 得到包路径+类名称部分-字符串截取
                    String pathFile = file.getAbsolutePath().substring(rootPath.length() - 1);
                    //4.4 判断当前文件的类型是否是.class
                    if (pathFile.contains(".class")){
                        //4.5 如果是.class类，把路径中的\替换成. 把.class去掉
                        String fullName = pathFile.replaceAll("\\\\",".").replace(".class","");
                        try {
                            //4.6 使用反射判断类上边是否有注解，有的话进行实例化
                            Class<?> aClass = Class.forName(fullName);
                            //把非接口的类实例化放在map中
                           if (!aClass.isInterface()){

                               Bean annotation = aClass.getAnnotation(Bean.class);
                               //判断一下有没有接口
                               if (annotation!= null){
                                   Object instance = aClass.newInstance();
                                   if (aClass.getInterfaces().length > 0){
                                       //如果有接口把接口的class当成key，实例对象当成value
                                       beanFactory.put(aClass.getInterfaces()[0],instance);
                                   }else{
                                       //如果没有接口把自己的class当成key，实例对象当成value
                                       beanFactory.put(aClass,instance);
                                   }
                               }

                           }
                        } catch (ClassNotFoundException e) {
                            throw new RuntimeException(e);
                        } catch (InstantiationException e) {
                            throw new RuntimeException(e);
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }

            }

        }
    }
















































}