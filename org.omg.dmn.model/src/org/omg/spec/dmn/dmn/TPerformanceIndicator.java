/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.omg.spec.dmn.dmn;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TPerformance Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.TPerformanceIndicator#getImpactingDecision <em>Impacting Decision</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmn.DMNPackage#getTPerformanceIndicator()
 * @model extendedMetaData="name='tPerformanceIndicator' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TPerformanceIndicator extends TBusinessContextElement {
	/**
	 * Returns the value of the '<em><b>Impacting Decision</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.spec.dmn.dmn.TDMNElementReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impacting Decision</em>' containment reference list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTPerformanceIndicator_ImpactingDecision()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='impactingDecision' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TDMNElementReference> getImpactingDecision();

} // TPerformanceIndicator
