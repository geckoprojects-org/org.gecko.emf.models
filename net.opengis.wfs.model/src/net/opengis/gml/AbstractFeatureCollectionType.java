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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Feature Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A feature collection contains zero or more features.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.AbstractFeatureCollectionType#getFeatureMember <em>Feature Member</em>}</li>
 *   <li>{@link net.opengis.gml.AbstractFeatureCollectionType#getFeatureMembers <em>Feature Members</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getAbstractFeatureCollectionType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractFeatureCollectionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractFeatureCollectionType extends AbstractFeatureType {
	/**
	 * Returns the value of the '<em><b>Feature Member</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.FeaturePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Member</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getAbstractFeatureCollectionType_FeatureMember()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='featureMember' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FeaturePropertyType> getFeatureMember();

	/**
	 * Returns the value of the '<em><b>Feature Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Members</em>' containment reference.
	 * @see #setFeatureMembers(FeatureArrayPropertyType)
	 * @see net.opengis.gml.GMLPackage#getAbstractFeatureCollectionType_FeatureMembers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='featureMembers' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureArrayPropertyType getFeatureMembers();

	/**
	 * Sets the value of the '{@link net.opengis.gml.AbstractFeatureCollectionType#getFeatureMembers <em>Feature Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Members</em>' containment reference.
	 * @see #getFeatureMembers()
	 * @generated
	 */
	void setFeatureMembers(FeatureArrayPropertyType value);

} // AbstractFeatureCollectionType
