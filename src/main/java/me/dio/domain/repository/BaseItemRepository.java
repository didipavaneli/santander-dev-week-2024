package me.dio.domain.repository;


import me.dio.domain.model.BaseItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseItemRepository extends JpaRepository<BaseItem, Long> {
}
