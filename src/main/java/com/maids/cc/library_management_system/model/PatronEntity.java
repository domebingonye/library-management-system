package com.maids.cc.library_management_system.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Accessors(chain = true)
@Data
@NoArgsConstructor
@Table(name = "PATRON")
public class PatronEntity extends AuditModel{
    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "CONTACT", nullable = false)
    private String contact;

    @Column(name = "INFORMATION", nullable = false)
    private String information;

    @Column(name = "PATRON_REG_ID", nullable = false)
    private String patronRegId;
}
