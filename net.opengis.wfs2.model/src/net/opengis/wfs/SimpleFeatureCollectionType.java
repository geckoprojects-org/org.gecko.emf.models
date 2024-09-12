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
 * A representation of the model object '<em><b>Simple Feature Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.SimpleFeatureCollectionType#getBoundedBy <em>Bounded By</em>}</li>
 *   <li>{@link net.opengis.wfs.SimpleFeatureCollectionType#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getSimpleFeatureCollectionType()
 * @model extendedMetaData="name='SimpleFeatureCollectionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SimpleFeatureCollectionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounded By</em>' containment reference.
	 * @see #setBoundedBy(EnvelopePropertyType)
	 * @see net.opengis.wfs.WFSPackage#getSimpleFeatureCollectionType_BoundedBy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='boundedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	EnvelopePropertyType getBoundedBy();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.SimpleFeatureCollectionType#getBoundedBy <em>Bounded By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounded By</em>' containment reference.
	 * @see #getBoundedBy()
	 * @generated
	 */
	void setBoundedBy(EnvelopePropertyType value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wfs.MemberPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getSimpleFeatureCollectionType_Member()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='member' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MemberPropertyType> getMember();

} // SimpleFeatureCollectionType
