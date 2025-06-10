<h2><a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock">121. Best Time to Buy and Sell Stock</a></h2><h3>Easy</h3><hr><p>You are given an array <code>prices</code> where <code>prices[i]</code> is the price of a given stock on the <code>i<sup>th</sup></code> day.</p>

<p>You want to maximize your profit by choosing a <strong>single day</strong> to buy one stock and choosing a <strong>different day in the future</strong> to sell that stock.</p>

<p>Return <em>the maximum profit you can achieve from this transaction</em>. If you cannot achieve any profit, return <code>0</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> prices = [7,1,5,3,6,4]
<strong>Output:</strong> 5
<strong>Explanation:</strong> Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> prices = [7,6,4,3,1]
<strong>Output:</strong> 0
<strong>Explanation:</strong> In this case, no transactions are done and the max profit = 0.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= prices.length &lt;= 10<sup>5</sup></code></li>
	<li><code>0 &lt;= prices[i] &lt;= 10<sup>4</sup></code></li>
</ul>

<h1>Solution : </h1>
<ol>
	<li>Initialize minimum to the largest possible value, so any price in the array which is smaller than it can replace it.</li>
	<li>Initialize maxProfit to 0 as no transactions have been made yet.</li>
	<li>
		Now start traversing the prices array
		<ul>
			<li>If the current price is lower than the previously recorded minimum, update the current minimum.</li>
			<li>Update min to the current price since it's the new minimum.</li>
			<li>If current price is not less than the minimum, then calculate the potential profit.</li>
			<li> Update maxProfit if the current profit is higher than the previously recorded max profit.</li>
		</ul>
	</li>
	<li>Return the best maxProfit that could be made from buying at the lowest and selling at the highest after that.</li>
</ol>
