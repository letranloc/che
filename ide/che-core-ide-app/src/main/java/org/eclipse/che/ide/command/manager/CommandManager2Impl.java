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

import org.eclipse.che.api.core.model.machine.Machine;
import org.eclipse.che.api.promises.client.Promise;
import org.eclipse.che.ide.api.command.ApplicableContext;
import org.eclipse.che.ide.api.command.CommandImpl;
import org.eclipse.che.ide.api.command.CommandManager2;
import org.eclipse.che.ide.api.command.CommandPage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * //
 *
 * @author Artem Zatsarynnyi
 */
public class CommandManager2Impl implements CommandManager2 {

    private final Set<CommandManagerDelegate> delegates;

    public CommandManager2Impl(Set<CommandManagerDelegate> delegates) {
        this.delegates = delegates;
    }

    @Override
    public List<CommandImpl> getCommands() {
        return null;
    }

    @Override
    public Promise<CommandImpl> createCommand(String type, ApplicableContext applicableContext) {
        return null;
    }

    @Override
    public Promise<CommandImpl> createCommand(String desirableName, String commandLine, String type, Map<String, String> attributes) {
        return null;
    }

    @Override
    public Promise<CommandImpl> updateCommand(String name, CommandImpl command) {
        return null;
    }

    @Override
    public Promise<Void> removeCommand(String commandName) {
        return null;
    }

    @Override
    public List<CommandPage> getPages(String type) {
        return null;
    }

    @Override
    public void executeCommand(CommandImpl command, Machine machine) {

    }

    @Override
    public void addCommandChangedListener(CommandChangedListener listener) {

    }

    @Override
    public void removeCommandChangedListener(CommandChangedListener listener) {

    }
}
