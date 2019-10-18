---
title: "Discrete Probability Distribution"
date: 2019-10-18
categories: math
---

{% include mathjax_support.html %}

## Discrete Uniform Distribution 이산형 균일분포

확률변수 $X$가 $x_1, x_2, \cdots, x_k$의 각 값을 취할 확률이 동일하다면, 이산형 균일분표는

$$
f(x;k) = \frac{1}{k}, x = x_1, x_2, \cdots, x_k
$$

로 주어진다.

이산형 균일분포의 평균과 분산은

$$
\mu = \frac{1}{k} \sum_{i=1}^{k} x_i
$$

$$
\sigma ^2 = \frac{1}{k} \sum_{i=1}^{k} (x_i - \mu)^2
$$

이 된다.

## Binomial Distribution 이항분포

성공확률이 $p$, 실패확률이 $q=1-p$의 베르누이 시행의 $n$회 독립시행에서 성공의 횟수를 나타내는 이항확률분포 $X$의 확률분포는

$$
b(x;n,p) = \binom{n}{x} p^x q^{n-x}, x=0, 1, 2, \cdots, n
$$

으로 주어진다.

이항분포 $b(x;n,p)$의 평균과 분산은 다음과 같다.

$$
\mu = np
$$

$$
\sigma ^2 = npq
$$

## Hypergeometric Distribution 초기하분포

$k$개의 성공과 $N-k$개의 실패로 구성된 크기 $N$인 유한모집단에서 크기 $n$인 확률 표본을 취할 때, 성공의 개수를 나타내는 초기화확률변수 $X$의 확률분포는 다음과 같다.

$$
h(x;N,n,k) = \frac{ \binom{k}{x} \binom{N-k}{n-x} }{ \binom{N}{n} }, max \{ 0, n-(N-k) \} \le x \le min \{ n, k \}
$$

초기하분포 $h(x;N,n,k)$ 의 평균과 분산은 다음과 같다.

$$
\mu = \frac{nk}{N}
$$

$$
\sigma ^2 = \frac{N-n}{N-1} \cdot n \cdot \frac{k}{N} \left( 1- \frac{k}{N} \right)
$$

### 이항분포와의 관계

초기하분포를 $p=k/N$ 인 이항분포로 근사시킬 수 있다.

평균과 분산 또한 다음과 같이 근사시킬 수 있다.

$$
\mu = np = \frac{nk}{N}
$$

$$
\sigma ^2 = npq = n \cdot \frac{k}{N} \left( 1- \frac{k}{N} \right)
$$

