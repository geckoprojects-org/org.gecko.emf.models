/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package org.openmicroscopy.ome;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Settings is an empty complex type that is contained and extended by all the *Settings elements
 *         Each *Settings element defines an attribute named ID of simple type *ID and the other information that is needed.
 *         Each simple type *ID is restricted to the base type LSID with an appropriate pattern
 *       
 * <!-- end-model-doc -->
 *
 *
 * @see org.openmicroscopy.ome.OMEPackage#getSettings()
 * @model extendedMetaData="name='Settings' kind='empty'"
 * @generated
 */
@ProviderType
public interface Settings extends Reference {
} // Settings
