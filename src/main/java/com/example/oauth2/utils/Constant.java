package com.example.oauth2.utils;

import org.apache.commons.lang3.StringUtils;

public class Constant {

    public enum Role {
        ROOT("root", "超级管理员"),
        USER("user", "用户");

        Role(String key, String name) {
            this.key = key;
            this.name = name;
        }

        private String key;
        private String name;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String nameOfKey(String key) {
            if (StringUtils.isEmpty(key)) {
                return "";
            }
            Role[] values = Role.values();
            for (Role role : values) {
                if (key.equals(role.key)) {
                    return name;
                }
            }
            return "";
        }
    }

    public enum LogicReject {
        USER_NOT_FOUND("1", "用户不存在");

        private String key;
        private String name;

        LogicReject(String key, String name) {
            this.key = key;
            this.name = name;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
