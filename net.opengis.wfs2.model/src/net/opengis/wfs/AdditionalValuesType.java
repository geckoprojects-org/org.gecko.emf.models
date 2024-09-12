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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Values Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.AdditionalValuesType#getValueCollection <em>Value Collection</em>}</li>
 *   <li>{@link net.opengis.wfs.AdditionalValuesType#getSimpleFeatureCollectionGroup <em>Simple Feature Collection Group</em>}</li>
 *   <li>{@link net.opengis.wfs.AdditionalValuesType#getSimpleFeatureCollection <em>Simple Feature Collection</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getAdditionalValuesType()
 * @model extendedMetaData="name='additionalValues_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AdditionalValuesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Collection</em>' containment reference.
	 * @see #setValueCollection(ValueCollectionType)
	 * @see net.opengis.wfs.WFSPackage#getAdditionalValuesType_ValueCollection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ValueCollection' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueCollectionType getValueCollection();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.AdditionalValuesType#getValueCollection <em>Value Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Collection</em>' containment reference.
	 * @see #getValueCollection()
	 * @generated
	 */
	void setValueCollection(ValueCollectionType value);

	/**
	 * Returns the value of the '<em><b>Simple Feature Collection Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Feature Collection Group</em>' attribute list.
	 * @see net.opengis.wfs.WFSPackage#getAdditionalValuesType_SimpleFeatureCollectionGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='SimpleFeatureCollection:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getSimpleFeatureCollectionGroup();

	/**
	 * Returns the value of the '<em><b>Simple Feature Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Feature Collection</em>' containment reference.
	 * @see #setSimpleFeatureCollection(SimpleFeatureCollectionType)
	 * @see net.opengis.wfs.WFSPackage#getAdditionalValuesType_SimpleFeatureCollection()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SimpleFeatureCollection' namespace='##targetNamespace' group='SimpleFeatureCollection:group'"
	 * @generated
	 */
	SimpleFeatureCollectionType getSimpleFeatureCollection();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.AdditionalValuesType#getSimpleFeatureCollection <em>Simple Feature Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Feature Collection</em>' containment reference.
	 * @see #getSimpleFeatureCollection()
	 * @generated
	 */
	void setSimpleFeatureCollection(SimpleFeatureCollectionType value);

} // AdditionalValuesType
