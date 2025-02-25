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
 * A representation of the model object '<em><b>Rights Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.RightsType#getRightsHolder <em>Rights Holder</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.RightsType#getRightsHeld <em>Rights Held</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getRightsType()
 * @model extendedMetaData="name='Rights_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RightsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Rights Holder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The rights holder for this data. [plain-text multi-line string]
	 *             e.g. "Copyright (C) 2002 - 2016 Open Microscopy Environment"
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rights Holder</em>' attribute.
	 * @see #setRightsHolder(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getRightsType_RightsHolder()
	 * @model dataType="org.openmicroscopy.ome.RightsHolderType"
	 *        extendedMetaData="kind='element' name='RightsHolder' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRightsHolder();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.RightsType#getRightsHolder <em>Rights Holder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rights Holder</em>' attribute.
	 * @see #getRightsHolder()
	 * @generated
	 */
	void setRightsHolder(String value);

	/**
	 * Returns the value of the '<em><b>Rights Held</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               The rights held by the rights holder. [plain-text multi-line string]
	 *               e.g. "All rights reserved" or "Creative Commons Attribution 3.0 Unported License"
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rights Held</em>' attribute.
	 * @see #setRightsHeld(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getRightsType_RightsHeld()
	 * @model dataType="org.openmicroscopy.ome.RightsHeldType"
	 *        extendedMetaData="kind='element' name='RightsHeld' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRightsHeld();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.RightsType#getRightsHeld <em>Rights Held</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rights Held</em>' attribute.
	 * @see #getRightsHeld()
	 * @generated
	 */
	void setRightsHeld(String value);

} // RightsType
