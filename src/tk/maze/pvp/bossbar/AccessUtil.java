package tk.maze.pvp.bossbar;

import java.lang.reflect.Method;
import java.lang.reflect.Field;

public abstract class AccessUtil
{
    public static Field setAccessible(final Field f) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        f.setAccessible(true);
        final Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(f, f.getModifiers() & 0xFFFFFFEF);
        return f;
    }
    
    public static Method setAccessible(final Method m) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        m.setAccessible(true);
        return m;
    }
}
