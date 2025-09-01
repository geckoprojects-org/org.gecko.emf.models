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
package net.opengis.ogc.features.impl;

import net.opengis.ogc.features.GregorianPeriod;
import net.opengis.ogc.features.OGCFeaturesPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gregorian Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GregorianPeriodImpl extends TemporalPeriodImpl implements GregorianPeriod {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GregorianPeriodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OGCFeaturesPackage.Literals.GREGORIAN_PERIOD;
	}

} //GregorianPeriodImpl
