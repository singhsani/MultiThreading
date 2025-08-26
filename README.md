<h1>Thread Creation Approaches in Java</h1>

    <h2>1st Approach: Extending Thread</h2>
    <p>
        <strong>myThread</strong> extends <strong>Thread</strong> and optionally implements <strong>Runnable</strong>
    </p>

    <h2>2nd Approach: Implementing Runnable</h2>
    <p>
        <strong>myRunnable</strong> implements <strong>Runnable</strong> interface.
    </p>

    <p>
        The <code>Runnable</code> interface is present in the <code>java.lang</code> package and contains only one method: <code>run()</code>
    </p>

    <h2>Case Study</h2>

    <pre>
    MyRunnable r = new MyRunnable();
    Thread t1 = new Thread();
    Thread t2 = new Thread(r);
    QQ</pre>

    <h3>Case 1: <code>t1.start();</code></h3>
    <p>
        A new thread will be created and will execute the <code>Thread</code> class's <code>run()</code> method, which has an empty implementation.
    </p>

    <h3>Case 2: <code>t1.run();</code></h3>
    <p>
        No new thread will be created. The <code>Thread</code> class's <code>run()</code> method will be executed just like a normal method call.
    </p>

    <h3>Case 3: <code>t2.start();</code></h3>
    <p>
        A new thread will be created, and it will execute the <code>run()</code> method of the <code>MyRunnable</code> class.
    </p>

    <h3>Case 4: <code>t2.run();</code></h3>
    <p>
        No new thread will be created. The <code>MyRunnable</code> class's <code>run()</code> method will be executed like a normal method call.
    </p>

    <h3>Case 5: <code>r.start();</code></h3>
    <p>
        This will result in a compile-time error: <code>MyRunnable</code> does not have <code>start()</code> capability.
        <br>
        <strong>Error:</strong> cannot find symbol <br>
        <strong>Symbol:</strong> method start() <br>
        <strong>Location:</strong> class MyRunnable
    </p>

    <h3>Case 6: <code>r.run();</code></h3>
    <p>
        No new thread will be created, and the <code>MyRunnable</code> class's <code>run()</code> method will be executed like a normal method call.
    </p>

    <h2>Which Approach is Best?</h2>
    <p>
        Among the two ways of defining a thread, <strong>implementing the Runnable interface</strong> is the recommended approach.
    </p>
    <ul>
        <li>
            In the first approach (extending Thread), our class already extends the <code>Thread</code> class, so we cannot extend any other class, thus losing the benefits of inheritance.
        </li>
        <li>
            In the second approach (implementing Runnable), since we are only implementing an interface, we can still extend another class and gain inheritance benefits.
        </li>
    </ul>

    <h2>Thread Class Constructors</h2>
    <ol>
        <li><code>Thread t = new Thread();</code></li>
        <li><code>Thread t = new Thread(Runnable r);</code></li>
        <li><code>Thread t = new Thread(String name);</code></li>
        <li><code>Thread t = new Thread(Runnable r, String name);</code></li>
        <li><code>Thread t = new Thread(ThreadGroup group, Runnable r);</code></li>
        <li><code>Thread t = new Thread(ThreadGroup group, Runnable r, String name);</code></li>
        <li><code>Thread t = new Thread(ThreadGroup group, String name);</code></li>
        <li><code>Thread t = new Thread(ThreadGroup group, Runnable r, String name, long stackSize);</code></li>
    </ol>
