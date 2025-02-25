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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Reference is an empty complex type that is contained and extended by all the *Ref elements and also the Settings Complex Type
 *         Each *Ref element defines an attribute named ID of simple type *ID and no other information
 *         Each simple type *ID is restricted to the base type LSID with an appropriate pattern
 *       
 * <!-- end-model-doc -->
 *
 *
 * @see org.openmicroscopy.ome.OMEPackage#getReference()
 * @model extendedMetaData="name='Reference' kind='empty'"
 * @generated
 */
@ProviderType
public interface Reference extends EObject {
} // Reference
