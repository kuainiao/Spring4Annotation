package com.cyh.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * ����һ�� Spring ����� FactoryBean
 */
public class ColorFactoryBean implements FactoryBean<Color> {

    //����һ��Color���������������ӵ�������
    @Override
    public Color getObject() {
        System.out.println("ColorFactoryBean...getObject...");
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    //�ǵ�����
    //true�����bean�ǵ�ʵ�����������б���һ��
    //false����ʵ����ÿ�λ�ȡ���ᴴ��һ���µ�bean
    @Override
    public boolean isSingleton() {
        return false;
    }

}
