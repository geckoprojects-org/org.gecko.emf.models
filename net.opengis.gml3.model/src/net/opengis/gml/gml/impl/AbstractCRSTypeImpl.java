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
package net.opengis.gml.gml.impl;

import java.util.Collection;

import net.opengis.gml.gml.AbstractCRSType;
import net.opengis.gml.gml.DomainOfValidityType;
import net.opengis.gml.gml.GMLPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract CRS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractCRSTypeImpl#getDomainOfValidity <em>Domain Of Validity</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractCRSTypeImpl#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractCRSTypeImpl extends IdentifiedObjectTypeImpl implements AbstractCRSType {
	/**
	 * The cached value of the '{@link #getDomainOfValidity() <em>Domain Of Validity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainOfValidity()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainOfValidityType> domainOfValidity;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected EList<String> scope;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractCRSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getAbstractCRSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DomainOfValidityType> getDomainOfValidity() {
		if (domainOfValidity == null) {
			domainOfValidity = new EObjectContainmentEList<DomainOfValidityType>(DomainOfValidityType.class, this, GMLPackage.ABSTRACT_CRS_TYPE__DOMAIN_OF_VALIDITY);
		}
		return domainOfValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getScope() {
		if (scope == null) {
			scope = new EDataTypeEList<String>(String.class, this, GMLPackage.ABSTRACT_CRS_TYPE__SCOPE);
		}
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.ABSTRACT_CRS_TYPE__DOMAIN_OF_VALIDITY:
				return ((InternalEList<?>)getDomainOfValidity()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMLPackage.ABSTRACT_CRS_TYPE__DOMAIN_OF_VALIDITY:
				return getDomainOfValidity();
			case GMLPackage.ABSTRACT_CRS_TYPE__SCOPE:
				return getScope();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMLPackage.ABSTRACT_CRS_TYPE__DOMAIN_OF_VALIDITY:
				getDomainOfValidity().clear();
				getDomainOfValidity().addAll((Collection<? extends DomainOfValidityType>)newValue);
				return;
			case GMLPackage.ABSTRACT_CRS_TYPE__SCOPE:
				getScope().clear();
				getScope().addAll((Collection<? extends String>)newValue);
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
			case GMLPackage.ABSTRACT_CRS_TYPE__DOMAIN_OF_VALIDITY:
				getDomainOfValidity().clear();
				return;
			case GMLPackage.ABSTRACT_CRS_TYPE__SCOPE:
				getScope().clear();
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
			case GMLPackage.ABSTRACT_CRS_TYPE__DOMAIN_OF_VALIDITY:
				return domainOfValidity != null && !domainOfValidity.isEmpty();
			case GMLPackage.ABSTRACT_CRS_TYPE__SCOPE:
				return scope != null && !scope.isEmpty();
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
		result.append(" (scope: ");
		result.append(scope);
		result.append(')');
		return result.toString();
	}

} //AbstractCRSTypeImpl
