/*******************************************************************************
 * Copyright (c) 2012-2016 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.ide.command.manager;

import org.eclipse.che.api.promises.client.Promise;
import org.eclipse.che.ide.api.command.ApplicableContext;
import org.eclipse.che.ide.api.command.CommandImpl;
import org.eclipse.che.ide.api.command.CommandManager2;
import org.eclipse.che.ide.api.command.CommandType;

import java.util.List;
import java.util.Map;

/**
 * //
 *
 * @author Artem Zatsarynnyi
 */
public interface CommandManagerDelegate {

    /** Returns commands. */
    List<CommandImpl> getCommands();

    /**
     * Creates new command of the specified type.
     * <p><b>Note</b> that command's name will be generated by {@link CommandManager2}
     * and command line will be provided by an appropriate {@link CommandType}.
     */
    Promise<CommandImpl> createCommand(String type, ApplicableContext applicableContext);

    /**
     * Creates new command with the specified arguments.
     * <p><b>Note</b> that name of the created command may differ from
     * the specified {@code desirableName} in order to prevent name duplication.
     */
    Promise<CommandImpl> createCommand(String desirableName, String commandLine, String type, Map<String, String> attributes);

    /**
     * Updates the command with the specified {@code name} by replacing it with the given {@code command}.
     * <p><b>Note</b> that name of the updated command may differ from the name provided by the given {@code command}
     * in order to prevent name duplication.
     */
    Promise<CommandImpl> updateCommand(String name, CommandImpl command);

    /** Removes the command with the specified {@code commandName}. */
    Promise<Void> removeCommand(String commandName);
}
