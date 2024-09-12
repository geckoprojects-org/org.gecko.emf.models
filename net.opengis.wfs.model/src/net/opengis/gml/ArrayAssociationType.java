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
package net.opengis.gml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A base for derived types used to specify complex types containing an array of objects, by unspecified UML association - either composition or aggregation.  An instance of this type contains elements representing Objects.
 * 
 * Ideally this type would be derived by extension of AssociationType.  
 * However, this leads to a non-deterministic content model, since both the base and the extension have minOccurs="0", and is thus prohibited in XML Schema.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.ArrayAssociationType#getObjectGroup <em>Object Group</em>}</li>
 *   <li>{@link net.opengis.gml.ArrayAssociationType#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getArrayAssociationType()
 * @model extendedMetaData="name='ArrayAssociationType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ArrayAssociationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Object Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This abstract element is the head of a substitutionGroup hierararchy which may contain either simpleContent or complexContent elements.  It is used to assert the model position of "class" elements declared in other GML schemas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Group</em>' attribute list.
	 * @see net.opengis.gml.GMLPackage#getArrayAssociationType_ObjectGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_Object:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getObjectGroup();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This abstract element is the head of a substitutionGroup hierararchy which may contain either simpleContent or complexContent elements.  It is used to assert the model position of "class" elements declared in other GML schemas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getArrayAssociationType_Object()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_Object' namespace='##targetNamespace' group='_Object:group'"
	 * @generated
	 */
	EList<EObject> getObject();

} // ArrayAssociationType
