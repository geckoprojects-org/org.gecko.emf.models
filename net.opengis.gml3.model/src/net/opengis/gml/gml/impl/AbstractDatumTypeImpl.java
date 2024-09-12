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

import javax.xml.datatype.XMLGregorianCalendar;

import net.opengis.gml.gml.AbstractDatumType;
import net.opengis.gml.gml.CodeType;
import net.opengis.gml.gml.DomainOfValidityType;
import net.opengis.gml.gml.GMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Datum Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractDatumTypeImpl#getDomainOfValidity <em>Domain Of Validity</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractDatumTypeImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractDatumTypeImpl#getAnchorDefinition <em>Anchor Definition</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractDatumTypeImpl#getRealizationEpoch <em>Realization Epoch</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractDatumTypeImpl extends IdentifiedObjectTypeImpl implements AbstractDatumType {
	/**
	 * The cached value of the '{@link #getDomainOfValidity() <em>Domain Of Validity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainOfValidity()
	 * @generated
	 * @ordered
	 */
	protected DomainOfValidityType domainOfValidity;

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
	 * The cached value of the '{@link #getAnchorDefinition() <em>Anchor Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorDefinition()
	 * @generated
	 * @ordered
	 */
	protected CodeType anchorDefinition;

	/**
	 * The default value of the '{@link #getRealizationEpoch() <em>Realization Epoch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizationEpoch()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar REALIZATION_EPOCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRealizationEpoch() <em>Realization Epoch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizationEpoch()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar realizationEpoch = REALIZATION_EPOCH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractDatumTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getAbstractDatumType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainOfValidityType getDomainOfValidity() {
		return domainOfValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainOfValidity(DomainOfValidityType newDomainOfValidity, NotificationChain msgs) {
		DomainOfValidityType oldDomainOfValidity = domainOfValidity;
		domainOfValidity = newDomainOfValidity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_DATUM_TYPE__DOMAIN_OF_VALIDITY, oldDomainOfValidity, newDomainOfValidity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainOfValidity(DomainOfValidityType newDomainOfValidity) {
		if (newDomainOfValidity != domainOfValidity) {
			NotificationChain msgs = null;
			if (domainOfValidity != null)
				msgs = ((InternalEObject)domainOfValidity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_DATUM_TYPE__DOMAIN_OF_VALIDITY, null, msgs);
			if (newDomainOfValidity != null)
				msgs = ((InternalEObject)newDomainOfValidity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_DATUM_TYPE__DOMAIN_OF_VALIDITY, null, msgs);
			msgs = basicSetDomainOfValidity(newDomainOfValidity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_DATUM_TYPE__DOMAIN_OF_VALIDITY, newDomainOfValidity, newDomainOfValidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getScope() {
		if (scope == null) {
			scope = new EDataTypeEList<String>(String.class, this, GMLPackage.ABSTRACT_DATUM_TYPE__SCOPE);
		}
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getAnchorDefinition() {
		return anchorDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnchorDefinition(CodeType newAnchorDefinition, NotificationChain msgs) {
		CodeType oldAnchorDefinition = anchorDefinition;
		anchorDefinition = newAnchorDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_DATUM_TYPE__ANCHOR_DEFINITION, oldAnchorDefinition, newAnchorDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnchorDefinition(CodeType newAnchorDefinition) {
		if (newAnchorDefinition != anchorDefinition) {
			NotificationChain msgs = null;
			if (anchorDefinition != null)
				msgs = ((InternalEObject)anchorDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_DATUM_TYPE__ANCHOR_DEFINITION, null, msgs);
			if (newAnchorDefinition != null)
				msgs = ((InternalEObject)newAnchorDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_DATUM_TYPE__ANCHOR_DEFINITION, null, msgs);
			msgs = basicSetAnchorDefinition(newAnchorDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_DATUM_TYPE__ANCHOR_DEFINITION, newAnchorDefinition, newAnchorDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getRealizationEpoch() {
		return realizationEpoch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRealizationEpoch(XMLGregorianCalendar newRealizationEpoch) {
		XMLGregorianCalendar oldRealizationEpoch = realizationEpoch;
		realizationEpoch = newRealizationEpoch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_DATUM_TYPE__REALIZATION_EPOCH, oldRealizationEpoch, realizationEpoch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.ABSTRACT_DATUM_TYPE__DOMAIN_OF_VALIDITY:
				return basicSetDomainOfValidity(null, msgs);
			case GMLPackage.ABSTRACT_DATUM_TYPE__ANCHOR_DEFINITION:
				return basicSetAnchorDefinition(null, msgs);
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
			case GMLPackage.ABSTRACT_DATUM_TYPE__DOMAIN_OF_VALIDITY:
				return getDomainOfValidity();
			case GMLPackage.ABSTRACT_DATUM_TYPE__SCOPE:
				return getScope();
			case GMLPackage.ABSTRACT_DATUM_TYPE__ANCHOR_DEFINITION:
				return getAnchorDefinition();
			case GMLPackage.ABSTRACT_DATUM_TYPE__REALIZATION_EPOCH:
				return getRealizationEpoch();
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
			case GMLPackage.ABSTRACT_DATUM_TYPE__DOMAIN_OF_VALIDITY:
				setDomainOfValidity((DomainOfValidityType)newValue);
				return;
			case GMLPackage.ABSTRACT_DATUM_TYPE__SCOPE:
				getScope().clear();
				getScope().addAll((Collection<? extends String>)newValue);
				return;
			case GMLPackage.ABSTRACT_DATUM_TYPE__ANCHOR_DEFINITION:
				setAnchorDefinition((CodeType)newValue);
				return;
			case GMLPackage.ABSTRACT_DATUM_TYPE__REALIZATION_EPOCH:
				setRealizationEpoch((XMLGregorianCalendar)newValue);
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
			case GMLPackage.ABSTRACT_DATUM_TYPE__DOMAIN_OF_VALIDITY:
				setDomainOfValidity((DomainOfValidityType)null);
				return;
			case GMLPackage.ABSTRACT_DATUM_TYPE__SCOPE:
				getScope().clear();
				return;
			case GMLPackage.ABSTRACT_DATUM_TYPE__ANCHOR_DEFINITION:
				setAnchorDefinition((CodeType)null);
				return;
			case GMLPackage.ABSTRACT_DATUM_TYPE__REALIZATION_EPOCH:
				setRealizationEpoch(REALIZATION_EPOCH_EDEFAULT);
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
			case GMLPackage.ABSTRACT_DATUM_TYPE__DOMAIN_OF_VALIDITY:
				return domainOfValidity != null;
			case GMLPackage.ABSTRACT_DATUM_TYPE__SCOPE:
				return scope != null && !scope.isEmpty();
			case GMLPackage.ABSTRACT_DATUM_TYPE__ANCHOR_DEFINITION:
				return anchorDefinition != null;
			case GMLPackage.ABSTRACT_DATUM_TYPE__REALIZATION_EPOCH:
				return REALIZATION_EPOCH_EDEFAULT == null ? realizationEpoch != null : !REALIZATION_EPOCH_EDEFAULT.equals(realizationEpoch);
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
		result.append(", realizationEpoch: ");
		result.append(realizationEpoch);
		result.append(')');
		return result.toString();
	}

} //AbstractDatumTypeImpl
