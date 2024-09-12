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
package net.opengis.wfs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.ExtendedDescriptionType#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getExtendedDescriptionType()
 * @model extendedMetaData="name='ExtendedDescriptionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ExtendedDescriptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wfs.ElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getExtendedDescriptionType_Element()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ElementType> getElement();

} // ExtendedDescriptionType
