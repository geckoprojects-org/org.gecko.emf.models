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
 * A representation of the model object '<em><b>Insert Results Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *             Reports the list of identifiers of all features created 
 *             by a transaction request.  New features are created using
 *             the Insert action and the list of idetifiers must be 
 *             presented in the same order as the Insert actions were
 *             encountered in the transaction request.  Features may
 *             optionally be correlated with identifiers using the 
 *             handle attribute (if it was specified on the Insert 
 *             element).
 *          
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.InsertResultsType#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getInsertResultsType()
 * @model extendedMetaData="name='InsertResultsType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface InsertResultsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wfs.InsertedFeatureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getInsertResultsType_Feature()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Feature' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InsertedFeatureType> getFeature();

} // InsertResultsType
