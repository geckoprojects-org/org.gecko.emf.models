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
package org.apache.maven.pom.pom.impl;

import org.apache.maven.pom.pom.POMPackage;
import org.apache.maven.pom.pom.Prerequisites;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prerequisites</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.apache.maven.pom.pom.impl.PrerequisitesImpl#getMaven <em>Maven</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrerequisitesImpl extends MinimalEObjectImpl.Container implements Prerequisites {
	/**
	 * The default value of the '{@link #getMaven() <em>Maven</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaven()
	 * @generated
	 * @ordered
	 */
	protected static final String MAVEN_EDEFAULT = "2.0";

	/**
	 * The cached value of the '{@link #getMaven() <em>Maven</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaven()
	 * @generated
	 * @ordered
	 */
	protected String maven = MAVEN_EDEFAULT;

	/**
	 * This is true if the Maven attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mavenESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrerequisitesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return POMPackage.Literals.PREREQUISITES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaven() {
		return maven;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaven(String newMaven) {
		String oldMaven = maven;
		maven = newMaven;
		boolean oldMavenESet = mavenESet;
		mavenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, POMPackage.PREREQUISITES__MAVEN, oldMaven, maven, !oldMavenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaven() {
		String oldMaven = maven;
		boolean oldMavenESet = mavenESet;
		maven = MAVEN_EDEFAULT;
		mavenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, POMPackage.PREREQUISITES__MAVEN, oldMaven, MAVEN_EDEFAULT, oldMavenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaven() {
		return mavenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case POMPackage.PREREQUISITES__MAVEN:
				return getMaven();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case POMPackage.PREREQUISITES__MAVEN:
				setMaven((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case POMPackage.PREREQUISITES__MAVEN:
				unsetMaven();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case POMPackage.PREREQUISITES__MAVEN:
				return isSetMaven();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (maven: ");
		if (mavenESet) result.append(maven); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PrerequisitesImpl
