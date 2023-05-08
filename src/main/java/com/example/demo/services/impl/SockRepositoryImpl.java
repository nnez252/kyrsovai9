package com.example.demo.services.impl;

import com.example.demo.model.Sock;
import com.example.demo.model.SocksColor;
import com.example.demo.model.SocksSize;
import com.example.demo.services.SockRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class SockRepositoryImpl implements SockRepository {
    private SockRepository sockRepository;

    public void SockService(SockRepository sockRepository) {
        this.sockRepository = sockRepository;
    }


    @Override
    public Object save(Sock updatedSock) {
        return null;
    }

    @Override
    public Optional<Sock> findByColorAndSizeAndCottonPart(SocksColor color, SocksSize size, Object cottonPart) {
        return Optional.empty();
    }

    @Override
    public List<Sock> findAllByColorAndSizeAndCottonPartBetween(SocksColor color, SocksSize size, Integer cottonMin, Integer cottonMax) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Sock> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Sock> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Sock> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Sock getOne(Long aLong) {
        return null;
    }

    @Override
    public Sock getById(Long aLong) {
        return null;
    }

    @Override
    public Sock getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Sock> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Sock> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Sock> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Sock> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Sock> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Sock> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Sock, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Sock> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Sock> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Sock> findAll() {
        return null;
    }

    @Override
    public List<Sock> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Sock entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Sock> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Sock> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Sock> findAll(Pageable pageable) {
        return null;
    }
}
