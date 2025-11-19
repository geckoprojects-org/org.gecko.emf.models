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
package org.open.oasis.docs.odata.ns.edmx.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.open.oasis.docs.odata.ns.edmx.EdmxPackage;
import org.open.oasis.docs.odata.ns.edmx.TIncludeAnnotations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TInclude Annotations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edmx.impl.TIncludeAnnotationsImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edmx.impl.TIncludeAnnotationsImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edmx.impl.TIncludeAnnotationsImpl#getTermNamespace <em>Term Namespace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TIncludeAnnotationsImpl extends MinimalEObjectImpl.Container implements TIncludeAnnotations {
	/**
	 * The default value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected String qualifier = QUALIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTermNamespace() <em>Term Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TERM_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTermNamespace() <em>Term Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermNamespace()
	 * @generated
	 * @ordered
	 */
	protected String termNamespace = TERM_NAMESPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TIncludeAnnotationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmxPackage.Literals.TINCLUDE_ANNOTATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQualifier() {
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQualifier(String newQualifier) {
		String oldQualifier = qualifier;
		qualifier = newQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmxPackage.TINCLUDE_ANNOTATIONS__QUALIFIER, oldQualifier, qualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetNamespace() {
		return targetNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetNamespace(String newTargetNamespace) {
		String oldTargetNamespace = targetNamespace;
		targetNamespace = newTargetNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmxPackage.TINCLUDE_ANNOTATIONS__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTermNamespace() {
		return termNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTermNamespace(String newTermNamespace) {
		String oldTermNamespace = termNamespace;
		termNamespace = newTermNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmxPackage.TINCLUDE_ANNOTATIONS__TERM_NAMESPACE, oldTermNamespace, termNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdmxPackage.TINCLUDE_ANNOTATIONS__QUALIFIER:
				return getQualifier();
			case EdmxPackage.TINCLUDE_ANNOTATIONS__TARGET_NAMESPACE:
				return getTargetNamespace();
			case EdmxPackage.TINCLUDE_ANNOTATIONS__TERM_NAMESPACE:
				return getTermNamespace();
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
			case EdmxPackage.TINCLUDE_ANNOTATIONS__QUALIFIER:
				setQualifier((String)newValue);
				return;
			case EdmxPackage.TINCLUDE_ANNOTATIONS__TARGET_NAMESPACE:
				setTargetNamespace((String)newValue);
				return;
			case EdmxPackage.TINCLUDE_ANNOTATIONS__TERM_NAMESPACE:
				setTermNamespace((String)newValue);
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
			case EdmxPackage.TINCLUDE_ANNOTATIONS__QUALIFIER:
				setQualifier(QUALIFIER_EDEFAULT);
				return;
			case EdmxPackage.TINCLUDE_ANNOTATIONS__TARGET_NAMESPACE:
				setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
				return;
			case EdmxPackage.TINCLUDE_ANNOTATIONS__TERM_NAMESPACE:
				setTermNamespace(TERM_NAMESPACE_EDEFAULT);
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
			case EdmxPackage.TINCLUDE_ANNOTATIONS__QUALIFIER:
				return QUALIFIER_EDEFAULT == null ? qualifier != null : !QUALIFIER_EDEFAULT.equals(qualifier);
			case EdmxPackage.TINCLUDE_ANNOTATIONS__TARGET_NAMESPACE:
				return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
			case EdmxPackage.TINCLUDE_ANNOTATIONS__TERM_NAMESPACE:
				return TERM_NAMESPACE_EDEFAULT == null ? termNamespace != null : !TERM_NAMESPACE_EDEFAULT.equals(termNamespace);
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
		result.append(" (qualifier: ");
		result.append(qualifier);
		result.append(", targetNamespace: ");
		result.append(targetNamespace);
		result.append(", termNamespace: ");
		result.append(termNamespace);
		result.append(')');
		return result.toString();
	}

} //TIncludeAnnotationsImpl
