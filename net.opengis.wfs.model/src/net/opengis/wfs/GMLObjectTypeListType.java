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
 * A representation of the model object '<em><b>GML Object Type List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.GMLObjectTypeListType#getGMLObjectType <em>GML Object Type</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getGMLObjectTypeListType()
 * @model extendedMetaData="name='GMLObjectTypeListType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GMLObjectTypeListType extends EObject {
	/**
	 * Returns the value of the '<em><b>GML Object Type</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wfs.GMLObjectTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   Name of this GML object type, including any namespace prefix
	 *                
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GML Object Type</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getGMLObjectTypeListType_GMLObjectType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GMLObjectType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GMLObjectTypeType> getGMLObjectType();

} // GMLObjectTypeListType
