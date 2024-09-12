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
package org.omg.bpmn.bpmn2.impl;

import org.eclipse.emf.ecore.EClass;

import org.omg.bpmn.bpmn2.Auditing;
import org.omg.bpmn.bpmn2.Bpmn2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auditing</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AuditingImpl extends BaseElementImpl implements Auditing {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuditingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.eINSTANCE.getAuditing();
	}

} //AuditingImpl
