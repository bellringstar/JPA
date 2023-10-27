package com.jpa.bookmanager.domain;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString // 자바에서는 ToString을 overring하도록 권고. 롬복에서는 어노테이션으로 처리
@NoArgsConstructor // jpa에서는 인자가 없는 생성자가 반드시 필요
@AllArgsConstructor
@RequiredArgsConstructor // 꼭 필요한 인자들을 이용해 생성자를 만들어준다.
@EqualsAndHashCode
public class User {
    @NonNull // 꼭 필요하게 된다 -> RequiredArgsConstructor 즉 NonNull이나 final이 없다면 NoArgsConstructor나 다름없다.
    private String name;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
