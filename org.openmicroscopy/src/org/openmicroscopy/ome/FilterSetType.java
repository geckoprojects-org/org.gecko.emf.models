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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.FilterSetType#getExcitationFilterRef <em>Excitation Filter Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.FilterSetType#getDichroicRef <em>Dichroic Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.FilterSetType#getEmissionFilterRef <em>Emission Filter Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.FilterSetType#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getFilterSetType()
 * @model extendedMetaData="name='FilterSet_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FilterSetType extends ManufacturerSpec {
	/**
	 * Returns the value of the '<em><b>Excitation Filter Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.FilterRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   The Filters placed in the Excitation light path.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Excitation Filter Ref</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getFilterSetType_ExcitationFilterRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExcitationFilterRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FilterRef> getExcitationFilterRef();

	/**
	 * Returns the value of the '<em><b>Dichroic Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dichroic Ref</em>' containment reference.
	 * @see #setDichroicRef(DichroicRefType)
	 * @see org.openmicroscopy.ome.OMEPackage#getFilterSetType_DichroicRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DichroicRef' namespace='##targetNamespace'"
	 * @generated
	 */
	DichroicRefType getDichroicRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.FilterSetType#getDichroicRef <em>Dichroic Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dichroic Ref</em>' containment reference.
	 * @see #getDichroicRef()
	 * @generated
	 */
	void setDichroicRef(DichroicRefType value);

	/**
	 * Returns the value of the '<em><b>Emission Filter Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.FilterRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                   The Filters placed in the Emission light path.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Emission Filter Ref</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getFilterSetType_EmissionFilterRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EmissionFilterRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FilterRef> getEmissionFilterRef();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getFilterSetType_ID()
	 * @model dataType="org.openmicroscopy.ome.FilterSetID" required="true"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.FilterSetType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

} // FilterSetType
