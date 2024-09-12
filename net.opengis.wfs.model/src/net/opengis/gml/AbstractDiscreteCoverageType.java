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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Discrete Coverage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A discrete coverage consists of a domain set, range set and optionally a coverage function. The domain set consists of either geometry or temporal objects, finite in number. The range set is comprised of a finite number of attribute values each of which is associated to every direct position within any single spatiotemporal object in the domain. In other words, the range values are constant on each spatiotemporal object in the domain. This coverage function maps each element from the coverage domain to an element in its range. This definition conforms to ISO 19123.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.AbstractDiscreteCoverageType#getCoverageFunction <em>Coverage Function</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getAbstractDiscreteCoverageType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractDiscreteCoverageType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractDiscreteCoverageType extends AbstractCoverageType {
	/**
	 * Returns the value of the '<em><b>Coverage Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage Function</em>' containment reference.
	 * @see #setCoverageFunction(CoverageFunctionType)
	 * @see net.opengis.gml.GMLPackage#getAbstractDiscreteCoverageType_CoverageFunction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coverageFunction' namespace='##targetNamespace'"
	 * @generated
	 */
	CoverageFunctionType getCoverageFunction();

	/**
	 * Sets the value of the '{@link net.opengis.gml.AbstractDiscreteCoverageType#getCoverageFunction <em>Coverage Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage Function</em>' containment reference.
	 * @see #getCoverageFunction()
	 * @generated
	 */
	void setCoverageFunction(CoverageFunctionType value);

} // AbstractDiscreteCoverageType
