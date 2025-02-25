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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Light Path Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.LightPathType#getExcitationFilterRef <em>Excitation Filter Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.LightPathType#getDichroicRef <em>Dichroic Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.LightPathType#getEmissionFilterRef <em>Emission Filter Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.LightPathType#getAnnotationRef <em>Annotation Ref</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getLightPathType()
 * @model extendedMetaData="name='LightPath_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LightPathType extends EObject {
	/**
	 * Returns the value of the '<em><b>Excitation Filter Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.FilterRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               The Filters placed in the Excitation light path.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Excitation Filter Ref</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getLightPathType_ExcitationFilterRef()
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
	 * @see org.openmicroscopy.ome.OMEPackage#getLightPathType_DichroicRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DichroicRef' namespace='##targetNamespace'"
	 * @generated
	 */
	DichroicRefType getDichroicRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.LightPathType#getDichroicRef <em>Dichroic Ref</em>}' containment reference.
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
	 *               The Filters placed in the Emission light path.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Emission Filter Ref</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getLightPathType_EmissionFilterRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EmissionFilterRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FilterRef> getEmissionFilterRef();

	/**
	 * Returns the value of the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.AnnotationRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The AnnotationRef element is a reference to an element derived
	 *         from the CommonAnnotation element.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation Ref</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getLightPathType_AnnotationRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AnnotationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationRefType> getAnnotationRef();

} // LightPathType
