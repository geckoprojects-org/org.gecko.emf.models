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
 * A representation of the model object '<em><b>Feature Type List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *             A list of feature types available from  this server.
 *          
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.FeatureTypeListType#getOperations <em>Operations</em>}</li>
 *   <li>{@link net.opengis.wfs.FeatureTypeListType#getFeatureType <em>Feature Type</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getFeatureTypeListType()
 * @model extendedMetaData="name='FeatureTypeListType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FeatureTypeListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference.
	 * @see #setOperations(OperationsType)
	 * @see net.opengis.wfs.WFSPackage#getFeatureTypeListType_Operations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Operations' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationsType getOperations();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.FeatureTypeListType#getOperations <em>Operations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operations</em>' containment reference.
	 * @see #getOperations()
	 * @generated
	 */
	void setOperations(OperationsType value);

	/**
	 * Returns the value of the '<em><b>Feature Type</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wfs.FeatureTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Type</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getFeatureTypeListType_FeatureType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FeatureType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FeatureTypeType> getFeatureType();

} // FeatureTypeListType
