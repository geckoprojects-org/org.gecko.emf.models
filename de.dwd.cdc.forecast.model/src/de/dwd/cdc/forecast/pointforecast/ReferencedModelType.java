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
package de.dwd.cdc.forecast.pointforecast;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenced Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.ReferencedModelType#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see de.dwd.cdc.forecast.pointforecast.PointforecastPackage#getReferencedModelType()
 * @model extendedMetaData="name='ReferencedModel_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ReferencedModelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference list.
	 * The list contents are of type {@link de.dwd.cdc.forecast.pointforecast.ModelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference list.
	 * @see de.dwd.cdc.forecast.pointforecast.PointforecastPackage#getReferencedModelType_Model()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Model' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ModelType> getModel();

} // ReferencedModelType
