package org.example.entity;
@Builder
@Data //getter,setter,toString
@NoArgsConstructor // bos const
@AllArgsConstructor //dolu const
@Entity
public class Kullanıcı {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int kullaniciId;
    @Column(unique = true,
            length = 50,
            nullable = false,
            updatable = false
    )
    private String kullaniciAdi;

    @Column(unique = false,
            length = 20,
            nullable = false,
            updatable = true
    )
    private String kullaniciSifre;
}
