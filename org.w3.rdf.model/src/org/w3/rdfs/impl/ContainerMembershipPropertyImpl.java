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
package org.w3.rdfs.impl;

import org.eclipse.emf.ecore.EClass;

import org.w3.rdf.impl.RDFPropertyImpl;

import org.w3.rdfs.ContainerMembershipProperty;
import org.w3.rdfs.RdfsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Membership Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ContainerMembershipPropertyImpl extends RDFPropertyImpl implements ContainerMembershipProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerMembershipPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdfsPackage.Literals.CONTAINER_MEMBERSHIP_PROPERTY;
	}

} //ContainerMembershipPropertyImpl
