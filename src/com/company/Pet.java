package com.company;

import java.util.Objects;

public class Pet {

    private String namePet;
    private String kindOfAnimal;

    public Pet(String namePet, String kindOfAnimal) {
        this.namePet = namePet;
        this.kindOfAnimal = kindOfAnimal;
    }

    public String getNamePet() {
        return namePet;
    }

    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

    public String getKindOfAnimal() {
        return kindOfAnimal;
    }

    public void setKindOfAnimal(String kindOfAnimal) {
        this.kindOfAnimal = kindOfAnimal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return getNamePet().equals(pet.getNamePet()) && getKindOfAnimal().equals(pet.getKindOfAnimal());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNamePet(), getKindOfAnimal());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "namePet='" + namePet + '\'' +
                ", kindOfAnimal='" + kindOfAnimal + '\'' +
                '}';
    }
}
