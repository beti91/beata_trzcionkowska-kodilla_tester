package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {

    String principal;
    String schoolName;

    public Principal(String principal, String schoolName) {
        this.principal = principal;
    }

    public String getPrincipal() {
        return principal;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal1 = (Principal) o;
        return Objects.equals(principal, principal1.principal) && Objects.equals(schoolName, principal1.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(principal, schoolName);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "principal='" + principal + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
