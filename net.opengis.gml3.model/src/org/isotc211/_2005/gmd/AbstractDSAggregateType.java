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
package org.isotc211._2005.gmd;

import org.eclipse.emf.common.util.EList;

import org.isotc211._2005.gco.AbstractObjectType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract DS Aggregate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identifiable collection of datasets
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.AbstractDSAggregateType#getComposedOf <em>Composed Of</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.AbstractDSAggregateType#getSeriesMetadata <em>Series Metadata</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.AbstractDSAggregateType#getSubset <em>Subset</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.AbstractDSAggregateType#getSuperset <em>Superset</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractDSAggregateType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractDS_Aggregate_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractDSAggregateType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Composed Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.DSDataSetPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed Of</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractDSAggregateType_ComposedOf()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='composedOf' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DSDataSetPropertyType> getComposedOf();

	/**
	 * Returns the value of the '<em><b>Series Metadata</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDMetadataPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series Metadata</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractDSAggregateType_SeriesMetadata()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='seriesMetadata' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDMetadataPropertyType> getSeriesMetadata();

	/**
	 * Returns the value of the '<em><b>Subset</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.DSAggregatePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subset</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractDSAggregateType_Subset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subset' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DSAggregatePropertyType> getSubset();

	/**
	 * Returns the value of the '<em><b>Superset</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.DSAggregatePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superset</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractDSAggregateType_Superset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='superset' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DSAggregatePropertyType> getSuperset();

} // AbstractDSAggregateType
