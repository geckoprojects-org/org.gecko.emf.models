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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Continuous Coverage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.AbstractContinuousCoverageType#getCoverageFunction <em>Coverage Function</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getAbstractContinuousCoverageType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractContinuousCoverageType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractContinuousCoverageType extends AbstractCoverageType {
	/**
	 * Returns the value of the '<em><b>Coverage Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:coverageFunction property describes the mapping function from the domain to the range of the coverage.
	 * The value of the CoverageFunction is one of gml:CoverageMappingRule and gml:GridFunction.
	 * If the gml:coverageFunction property is omitted for a gridded coverage (including rectified gridded coverages) the gml:startPoint is assumed to be the value of the gml:low property in the gml:Grid geometry, and the gml:sequenceRule is assumed to be linear and the gml:axisOrder property is assumed to be "+1 +2".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage Function</em>' containment reference.
	 * @see #setCoverageFunction(CoverageFunctionType)
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractContinuousCoverageType_CoverageFunction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coverageFunction' namespace='##targetNamespace'"
	 * @generated
	 */
	CoverageFunctionType getCoverageFunction();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.AbstractContinuousCoverageType#getCoverageFunction <em>Coverage Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage Function</em>' containment reference.
	 * @see #getCoverageFunction()
	 * @generated
	 */
	void setCoverageFunction(CoverageFunctionType value);

} // AbstractContinuousCoverageType
