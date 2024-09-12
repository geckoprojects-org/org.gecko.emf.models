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
package net.opengis.gml.gml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.FeatureArrayPropertyType#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.FeatureArrayPropertyType#getAbstractFeatureGroup <em>Abstract Feature Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.FeatureArrayPropertyType#getAbstractFeature <em>Abstract Feature</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getFeatureArrayPropertyType()
 * @model extendedMetaData="name='FeatureArrayPropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FeatureArrayPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getFeatureArrayPropertyType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Feature Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This abstract element serves as the head of a substitution group which may contain any elements whose content model is derived from gml:AbstractFeatureType.  This may be used as a variable in the construction of content models.  
	 * gml:AbstractFeature may be thought of as "anything that is a GML feature" and may be used to define variables or templates in which the value of a GML property is "any feature". This occurs in particular in a GML feature collection where the feature member properties contain one or multiple copies of gml:AbstractFeature respectively.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Feature Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getFeatureArrayPropertyType_AbstractFeatureGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='AbstractFeature:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAbstractFeatureGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Feature</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.AbstractFeatureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This abstract element serves as the head of a substitution group which may contain any elements whose content model is derived from gml:AbstractFeatureType.  This may be used as a variable in the construction of content models.  
	 * gml:AbstractFeature may be thought of as "anything that is a GML feature" and may be used to define variables or templates in which the value of a GML property is "any feature". This occurs in particular in a GML feature collection where the feature member properties contain one or multiple copies of gml:AbstractFeature respectively.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Feature</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getFeatureArrayPropertyType_AbstractFeature()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractFeature' namespace='##targetNamespace' group='AbstractFeature:group'"
	 * @generated
	 */
	EList<AbstractFeatureType> getAbstractFeature();

} // FeatureArrayPropertyType
