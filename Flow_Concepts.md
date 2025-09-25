<style>
:root {
    --bg-dark: #1a1a2e;
    --bg-darker: #16213e;
    --primary: #00b4d8;
    --secondary: #90e0ef;
    --accent: #ff9e00;
    --text: #e6f1ff;
    --code-bg: #0f3460;
    --border: #2a3a5f;
    --success: #2ecc71;
    --warning: #f39c12;
    --error: #e74c3c;
}

body {
    background-color: var(--bg-dark);
    color: var(--text);
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    line-height: 1.6;
    max-width: 1200px;
    margin: 0 auto;
    padding: 20px;
}

h1, h2, h3, h4, h5, h6 {
    color: var(--primary);
    margin-top: 1.5em;
    border-bottom: 2px solid var(--border);
    padding-bottom: 0.3em;
}

h1 {
    color: var(--accent);
    text-align: center;
    font-size: 2.5em;
    margin-bottom: 1em;
    text-shadow: 0 0 10px rgba(255, 158, 0, 0.3);
}

h2 {
    color: var(--secondary);
    border-left: 4px solid var(--accent);
    padding-left: 15px;
}

code, pre {
    background-color: var(--code-bg);
    border-radius: 4px;
    padding: 2px 6px;
    font-family: 'Fira Code', 'Courier New', monospace;
    font-size: 0.9em;
    color: #f8f8f2;
}

pre {
    padding: 15px;
    overflow-x: auto;
    border-left: 4px solid var(--accent);
    margin: 1em 0;
}

a {
    color: var(--primary);
    text-decoration: none;
    transition: color 0.3s;
}

a:hover {
    color: var(--accent);
    text-decoration: underline;
}

blockquote {
    border-left: 4px solid var(--primary);
    padding-left: 15px;
    margin: 1.5em 0;
    color: #b3b9c5;
    font-style: italic;
}

.highlight {
    background: linear-gradient(90deg, rgba(0,180,216,0.1) 0%, rgba(144,224,239,0.1) 100%);
    padding: 15px;
    border-radius: 5px;
    margin: 1em 0;
    border: 1px solid var(--border);
}

.tip {
    background: rgba(46, 204, 113, 0.1);
    border-left: 4px solid var(--success);
    padding: 1em;
    margin: 1em 0;
    border-radius: 0 4px 4px 0;
}

.warning {
    background: rgba(243, 156, 18, 0.1);
    border-left: 4px solid var(--warning);
    padding: 1em;
    margin: 1em 0;
    border-radius: 0 4px 4px 0;
}

.danger {
    background: rgba(231, 76, 60, 0.1);
    border-left: 4px solid var(--error);
    padding: 1em;
    margin: 1em 0;
    border-radius: 0 4px 4px 0;
}

.table-container {
    overflow-x: auto;
    margin: 1.5em 0;
}

table {
    width: 100%;
    border-collapse: collapse;
    margin: 1em 0;
    background: var(--bg-darker);
    border-radius: 5px;
    overflow: hidden;
}

th, td {
    padding: 12px 15px;
    text-align: left;
    border-bottom: 1px solid var(--border);
}

th {
    background-color: var(--code-bg);
    color: var(--accent);
    font-weight: 600;
}

tr:hover {
    background-color: rgba(255, 255, 255, 0.03);
}

.badge {
    display: inline-block;
    padding: 3px 8px;
    border-radius: 12px;
    font-size: 0.8em;
    font-weight: bold;
    margin-right: 8px;
}

.badge-primary {
    background-color: var(--primary);
    color: #fff;
}

.badge-secondary {
    background-color: var(--secondary);
    color: #000;
}

.badge-accent {
    background-color: var(--accent);
    color: #000;
}

/* Custom scrollbar */
::-webkit-scrollbar {
    width: 8px;
    height: 8px;
}

::-webkit-scrollbar-track {
    background: var(--bg-darker);
}

::-webkit-scrollbar-thumb {
    background: var(--primary);
    border-radius: 4px;
}

::-webkit-scrollbar-thumb:hover {
    background: var(--accent);
}
</style>

<div class="header">
    <h1>✨ Kotlin Flow - Complete Reference</h1>
    <p style="text-align: center; color: var(--secondary); margin-top: -15px;">Master Kotlin Coroutines Flow with this comprehensive guide</p>
</div>

## 🗂️ Table of Contents
1. [🚀 Introduction to Flow](#introduction-to-flow)
2. [🏗️ Flow Builders](#flow-builders)
3. [⏱️ Synchronous Operations](#synchronous-operations)
4. 

## Introduction to Flow
Kotlin Flow is a stream processing API that can emit multiple values sequentially. It's part of Kotlin Coroutines and is designed to handle asynchronous data streams.

## 🏗️ Flow Builders

### 🔧 Basic Builders
<div class="highlight">
- <span style="color: var(--primary);">`flow { ... }`</span> - Creates a cold flow from a suspendable block
- <span style="color: var(--primary);">`flowOf(...)`</span> - Creates a flow from a fixed set of values
- <span style="color: var(--primary);">`asFlow()`</span> - Converts collections, sequences, or other types to a Flow
- <span style="color: var(--primary);">`channelFlow { ... }`</span> - Creates a flow with the ability to emit values from different coroutines
- <span style="color: var(--primary);">`callbackFlow { ... }`</span> - Creates a flow from a callback-based API
</div>

### 🔄 StateFlow and SharedFlow Builders
<div class="highlight">
- <span style="color: var(--accent);">`MutableStateFlow(initialValue)`</span> - Creates a state holder flow
- <span style="color: var(--accent);">`MutableSharedFlow(...)`</span> - Creates a shared flow with configurable replay and buffer
</div>

## ⏱️ Synchronous Operations

### 🎯 Terminal Operators (Synchronous)
<div class="highlight">
<ol>
<li><span class="badge badge-primary">first()</span> - Returns the first value and cancels the flow</li>
<li><span class="badge badge-primary">single()</span> - Ensures the flow emits exactly one value</li>
<li><span class="badge badge-primary">reduce { acc, value -> ... }</span> - Accumulates values starting with the first value</li>
<li><span class="badge badge-primary">fold(initial) { acc, value -> ... }</span> - Accumulates values starting with an initial value</li>
<li><span class="badge badge-primary">toList()</span> - Collects all values into a List</li>
<li><span class="badge badge-primary">toSet()</span> - Collects all values into a Set</li>
<li><span class="badge badge-primary">count()</span> - Counts the number of values</li>
<li><span class="badge badge-primary">first { ... }</span> - Returns the first value matching the predicate</li>
<li><span class="badge badge-primary">firstOrNull()</span> - Returns the first value or null if empty</li>
<li><span class="badge badge-primary">singleOrNull()</span> - Returns the single value or null if empty/contains multiple values</li>
</ol>
</div>

### 🔄 Intermediate Operators (Synchronous)
<div class="highlight">
<ol>
<li><span class="badge badge-secondary">map { ... }</span> - Transforms each value</li>
<li><span class="badge badge-secondary">filter { ... }</span> - Filters values based on a predicate</li>
<li><span class="badge badge-secondary">take(count)</span> - Takes the first n values</li>
<li><span class="badge badge-secondary">drop(count)</span> - Skips the first n values</li>
<li><span class="badge badge-secondary">distinctUntilChanged()</span> - Filters out consecutive duplicate values</li>
<li><span class="badge badge-secondary">onEach { ... }</span> - Performs an action for each value</li>
<li><span class="badge badge-secondary">filterNot { ... }</span> - Filters values that don't match the predicate</li>
<li><span class="badge badge-secondary">filterNotNull()</span> - Filters out null values</li>
<li><span class="badge badge-secondary">mapNotNull { ... }</span> - Transforms values, skipping null results</li>
<li><span class="badge badge-secondary">withIndex()</span> - Wraps each value with its index</li>
</ol>
</div>

## ⚡ Asynchronous Operations

### 🎯 Terminal Operators (Asynchronous)
<div class="highlight">
<ol>
<li><span class="badge badge-accent">collect { ... }</span> - Collects values from the flow (suspending)</li>
<li><span class="badge badge-accent">collectLatest { ... }</span> - Cancels previous collection when a new value arrives</li>
<li><span class="badge badge-accent">launchIn(scope)</span> - Launches the collection in a coroutine scope</li>
<li><span class="badge badge-accent">catch { ... }</span> - Handles exceptions in the flow</li>
<li><span class="badge badge-accent">onCompletion { ... }</span> - Handles flow completion</li>
</ol>
</div>

### 🔄 Intermediate Operators (Asynchronous)
<div class="highlight">
<ol>
<li><span class="badge badge-secondary">buffer()</span> - Buffers flow emissions</li>
<li><span class="badge badge-secondary">conflate()</span> - Skips intermediate values when collector is slow</li>
<li><span class="badge badge-secondary">debounce(timeout)</span> - Filters values that are followed by newer values within a timeout</li>
<li><span class="badge badge-secondary">sample(period)</span> - Samples the latest value at a fixed interval</li>
<li><span class="badge badge-secondary">flatMapConcat { ... }</span> - Transforms each value to a flow and flattens them sequentially</li>
<li><span class="badge badge-secondary">flatMapMerge { ... }</span> - Transforms each value to a flow and merges them concurrently</li>
<li><span class="badge badge-secondary">flatMapLatest { ... }</span> - Switches to a new flow when a new value arrives</li>
<li><span class="badge badge-secondary">onStart { ... }</span> - Performs an action when the flow starts</li>
<li><span class="badge badge-secondary">onEach { ... }</span> - Performs an action for each value</li>
<li><span class="badge badge-secondary">retryWhen { ... }</span> - Retries the flow when an exception occurs</li>
</ol>
</div>

## 🧵 Flow Context and Threading
<div class="highlight">
<ol>
<li><span class="badge badge-primary">flowOn(context)</span> - Changes the context where the flow is executed</li>
<li><span class="badge badge-primary">buffer()</span> - Buffers flow emissions when needed</li>
<li><span class="badge badge-primary">conflate()</span> - Skips intermediate values when collector is slow</li>
<li><span class="badge badge-accent">flowOn(Dispatchers.IO)</span> - Specifies the dispatcher for the flow</li>
</ol>
</div>

## ⚠️ Exception Handling
<div class="highlight">
<ol>
<li><span class="badge badge-accent">catch { ... }</span> - Handles exceptions in the flow</li>
<li><span class="badge badge-accent">retry(retries) { ... }</span> - Retries the flow a number of times</li>
<li><span class="badge badge-accent">retryWhen { ... }</span> - Retries the flow based on a condition</li>
<li><span class="badge badge-accent">onCompletion { ... }</span> - Handles flow completion (both success and failure)</li>
</ol>
</div>

## 🔄 Flow Combination
<div class="highlight">
<ol>
<li><span class="badge badge-secondary">combine(flow1, flow2) { ... }</span> - Combines the latest values from multiple flows</li>
<li><span class="badge badge-secondary">zip(flow1, flow2) { ... }</span> - Combines corresponding values from multiple flows</li>
<li><span class="badge badge-secondary">merge(flow1, flow2, ...)</span> - Merges multiple flows into one</li>
<li><span class="badge badge-secondary">flatMapConcat { ... }</span> - Transforms each value to a flow and flattens them sequentially</li>
<li><span class="badge badge-secondary">flatMapMerge { ... }</span> - Transforms each value to a flow and merges them concurrently</li>
<li><span class="badge badge-secondary">flatMapLatest { ... }</span> - Switches to a new flow when a new value arrives</li>
</ol>
</div>

## 🌊 StateFlow and SharedFlow

### 🔵 StateFlow
<div class="highlight">
<ul>
<li><span class="badge badge-primary">stateIn(scope)</span> - Converts a cold flow to a StateFlow</li>
<li><span class="badge badge-primary">collect { ... }</span> - Collects values from StateFlow</li>
<li><span class="badge badge-accent">value</span> - Gets the current value (synchronously)</li>
<li><span class="badge badge-primary">tryEmit(value)</span> - Attempts to emit a new value</li>
</ul>
</div>

### 🔄 SharedFlow
<div class="highlight">
<ul>
<li><span class="badge badge-secondary">shareIn(scope, started, replay)</span> - Converts a cold flow to a SharedFlow</li>
<li><span class="badge badge-secondary">collect { ... }</span> - Collects values from SharedFlow</li>
<li><span class="badge badge-accent">tryEmit(value)</span> - Attempts to emit a new value</li>
<li><span class="badge badge-secondary">replayCache</span> - Gets the replay cache of the SharedFlow</li>
</ul>
</div>

## 💡 Best Practices
<div class="highlight">
<ol>
<li>Use <span class="badge badge-primary">flowOn</span> to specify the dispatcher for flow execution</li>
<li>Use <span class="badge badge-accent">catch</span> to handle exceptions in flows</li>
<li>Use <span class="badge badge-secondary">buffer()</span> when the producer is faster than the consumer</li>
<li>Use <span class="badge badge-secondary">conflate()</span> when you only care about the latest value</li>
<li>Use <span class="badge badge-accent">collectLatest</span> when you only care about the most recent value</li>
<li>Use <span class="badge badge-primary">stateIn</span> and <span class="badge badge-secondary">shareIn</span> to share flows between multiple collectors</li>
</ol>
</div>

## 🚀 Example Usage

```kotlin
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {
    // 🌟 Creating a flow
    val flow = flow {
        emit(1)
        delay(100)
        emit(2)
    }

    // 📥 Collecting values
    println("🔹 Simple collection:")
    flow.collect { value ->
        println("   Received: $value")
    }

    // 🎨 Transforming values
    println("\n🔹 Transforming values:")
    flow
        .map { it * 2 }
        .filter { it > 2 }
        .collect { println("   Processed: $it") }

    // ⚠️ Handling errors
    println("\n🔹 Error handling:")
    flow
        .catch { e -> println("   Error: $e") }
        .collect { println("   Received: $it") }

    // 🤝 Combining flows
    println("\n🔹 Combining flows:")
    val flow1 = flowOf(1, 2, 3)
    val flow2 = flowOf("A", "B", "C")
    
    flow1.zip(flow2) { a, b -> "$a$b" }
        .collect { println("   Combined: $it") }  // 1A, 2B, 3C
}
```

## 🎯 Conclusion
Kotlin Flow provides a rich set of operators for both synchronous and asynchronous stream processing. Understanding these operators and when to use them is key to writing efficient and maintainable coroutine-based code.

<div class="tip">
💡 <strong>Pro Tip:</strong> Always consider the lifecycle of your coroutines and use appropriate scopes to prevent memory leaks.
</div>

<div class="warning">
⚠️ <strong>Note:</strong> Remember that Flow is cold by default - it starts emitting values only when collected.
</div>

<div class="danger">
🚨 <strong>Warning:</strong> Be cautious with infinite flows - always use operators like <code>take()</code> or cancel the coroutine scope to prevent memory leaks.
</div>

---

<div style="text-align: center; margin-top: 2em; padding: 1.5em; background: rgba(0, 180, 216, 0.1); border-radius: 8px; border-left: 4px solid var(--accent);">
    <div style="font-size: 1.2em; color: var(--accent); margin-bottom: 0.5em; display: flex; align-items: center; justify-content: center;">
        <svg width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" style="margin-right: 8px;">
            <path d="M12 2L2 7l10 5 10-5-10-5zM2 17l10 5 10-5M2 12l10 5 10-5"></path>
        </svg>
        Documentation by
    </div>
    <div style="font-size: 1.5em; font-weight: bold; color: var(--primary); margin-bottom: 0.5em;">
        Amit Upadhyay
    </div>
    <a href="https://github.com/A-U-7" 
       target="_blank" 
       style="display: inline-flex; align-items: center; 
              color: var(--secondary); text-decoration: none;
              padding: 8px 16px; border-radius: 20px;
              background: rgba(144, 224, 239, 0.1);
              transition: all 0.3s ease;
              border: 1px solid var(--border);">
        <svg height="18" aria-hidden="true" viewBox="0 0 16 16" version="1.1" width="18" data-view-component="true" style="margin-right: 8px;">
            <path fill="var(--secondary)" fill-rule="evenodd" d="M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0016 8c0-4.42-3.58-8-8-8z"></path>
        </svg>
        @A-U-7
    </a>
</div>

<style>
    a[href*="github"]:hover {
        background: rgba(144, 224, 239, 0.2) !important;
        transform: translateY(-2px);
        box-shadow: 0 4px 12px rgba(0, 180, 216, 0.2);
    }
</style>
