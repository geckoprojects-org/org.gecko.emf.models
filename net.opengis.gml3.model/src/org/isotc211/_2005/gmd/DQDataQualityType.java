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
 * A representation of the model object '<em><b>DQ Data Quality Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.DQDataQualityType#getScope <em>Scope</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DQDataQualityType#getReport <em>Report</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DQDataQualityType#getLineage <em>Lineage</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getDQDataQualityType()
 * @model extendedMetaData="name='DQ_DataQuality_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DQDataQualityType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference.
	 * @see #setScope(DQScopePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDQDataQualityType_Scope()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='scope' namespace='##targetNamespace'"
	 * @generated
	 */
	DQScopePropertyType getScope();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DQDataQualityType#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(DQScopePropertyType value);

	/**
	 * Returns the value of the '<em><b>Report</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.DQElementPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getDQDataQualityType_Report()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='report' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DQElementPropertyType> getReport();

	/**
	 * Returns the value of the '<em><b>Lineage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lineage</em>' containment reference.
	 * @see #setLineage(LILineagePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDQDataQualityType_Lineage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lineage' namespace='##targetNamespace'"
	 * @generated
	 */
	LILineagePropertyType getLineage();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DQDataQualityType#getLineage <em>Lineage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lineage</em>' containment reference.
	 * @see #getLineage()
	 * @generated
	 */
	void setLineage(LILineagePropertyType value);

} // DQDataQualityType
