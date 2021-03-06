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

## Negative Binomial Distribution 음이항분포

독립적인 반복시행에서 성공확률이 $p$, 실패확률이 $q$라 하면, $k$번째 성공이 일어날 때까지의 시행횟수인 확률변수 $X$의 확률분포는

$$
b^* (x;k,p) = \binom{x-1}{k-1} p^k q^{x-k}, x = k, k+1, k+2, \cdots
$$

로 주어진다.

## Geometric Distribution 기하분포

독립적인 반복시행에서 성공확률이 $p$, 실패확률이 $q=1-p$라 할 때, 첫 번째 성공이 일어날 때 까지의 시행횟수인 확률변수 $X$의 확률분포는 

$$
g(x;p) = pq^{x-1}, x=1, 2, 3, \cdots
$$

으로 주어진다.

기하분포를 따르는 확률변수의 평균과 분산은 각각 다음과 같다.

$$
\mu = \frac{1}{p}
$$

$$
\sigma ^2 = \frac{1-p}{p^2}
$$

## Poisson Distribution 포아송 분포

일정한 시간간격 $t$ 동안에 또는 일정영역 $t$에서 발생하는 결과의 수를 나타내는 포아송 확률변수 $X$의 확률분포는 다음과 같다.

$$
p(x; \lambda t) = \frac{ e^{- \lambda t} (\lambda t)^x }{x!} ,  x=0, 1, 2, \cdots
$$

여기서 $\lambda$는 단위시간 또는 단위면적에서 발생하는 결과의 평균수이고, $e=2.71828\cdots$이다.

포아송 분포 $p(x; \lambda t)$의 평균과 분산은 $\lambda t$ 이다.

$X$를 $b = (x;n,p)$를 따르는 이항확률변수라 하자. $n \rightarrow \infty, p \rightarrow 0$ 이고, $np \rightarrow \mu$가 상수이면,

$$
b(x;n,p) \rightarrow p(x; \mu)
$$
