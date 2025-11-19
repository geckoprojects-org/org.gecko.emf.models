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
package org.open.oasis.docs.odata.ns.edm.impl;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.open.oasis.docs.odata.ns.edm.AnnotationType;
import org.open.oasis.docs.odata.ns.edm.EdmPackage;
import org.open.oasis.docs.odata.ns.edm.TTypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TType Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTypeDefinitionImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTypeDefinitionImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTypeDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTypeDefinitionImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTypeDefinitionImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTypeDefinitionImpl#getSRID <em>SRID</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTypeDefinitionImpl#getUnderlyingType <em>Underlying Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TTypeDefinitionImpl#isUnicode <em>Unicode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TTypeDefinitionImpl extends MinimalEObjectImpl.Container implements TTypeDefinition {
	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationType> annotation;

	/**
	 * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final Object MAX_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected Object maxLength = MAX_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PRECISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected BigInteger precision = PRECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final Object SCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected Object scale = SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSRID() <em>SRID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSRID()
	 * @generated
	 * @ordered
	 */
	protected static final Object SRID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSRID() <em>SRID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSRID()
	 * @generated
	 * @ordered
	 */
	protected Object sRID = SRID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnderlyingType() <em>Underlying Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderlyingType()
	 * @generated
	 * @ordered
	 */
	protected static final Object UNDERLYING_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnderlyingType() <em>Underlying Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderlyingType()
	 * @generated
	 * @ordered
	 */
	protected Object underlyingType = UNDERLYING_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnicode() <em>Unicode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnicode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNICODE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnicode() <em>Unicode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnicode()
	 * @generated
	 * @ordered
	 */
	protected boolean unicode = UNICODE_EDEFAULT;

	/**
	 * This is true if the Unicode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unicodeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TTypeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmPackage.eINSTANCE.getTTypeDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectContainmentEList<AnnotationType>(AnnotationType.class, this, EdmPackage.TTYPE_DEFINITION__ANNOTATION);
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLength(Object newMaxLength) {
		Object oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TTYPE_DEFINITION__MAX_LENGTH, oldMaxLength, maxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TTYPE_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecision(BigInteger newPrecision) {
		BigInteger oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TTYPE_DEFINITION__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScale(Object newScale) {
		Object oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TTYPE_DEFINITION__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getSRID() {
		return sRID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSRID(Object newSRID) {
		Object oldSRID = sRID;
		sRID = newSRID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TTYPE_DEFINITION__SRID, oldSRID, sRID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getUnderlyingType() {
		return underlyingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnderlyingType(Object newUnderlyingType) {
		Object oldUnderlyingType = underlyingType;
		underlyingType = newUnderlyingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TTYPE_DEFINITION__UNDERLYING_TYPE, oldUnderlyingType, underlyingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUnicode() {
		return unicode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnicode(boolean newUnicode) {
		boolean oldUnicode = unicode;
		unicode = newUnicode;
		boolean oldUnicodeESet = unicodeESet;
		unicodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TTYPE_DEFINITION__UNICODE, oldUnicode, unicode, !oldUnicodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetUnicode() {
		boolean oldUnicode = unicode;
		boolean oldUnicodeESet = unicodeESet;
		unicode = UNICODE_EDEFAULT;
		unicodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdmPackage.TTYPE_DEFINITION__UNICODE, oldUnicode, UNICODE_EDEFAULT, oldUnicodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUnicode() {
		return unicodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdmPackage.TTYPE_DEFINITION__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
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
			case EdmPackage.TTYPE_DEFINITION__ANNOTATION:
				return getAnnotation();
			case EdmPackage.TTYPE_DEFINITION__MAX_LENGTH:
				return getMaxLength();
			case EdmPackage.TTYPE_DEFINITION__NAME:
				return getName();
			case EdmPackage.TTYPE_DEFINITION__PRECISION:
				return getPrecision();
			case EdmPackage.TTYPE_DEFINITION__SCALE:
				return getScale();
			case EdmPackage.TTYPE_DEFINITION__SRID:
				return getSRID();
			case EdmPackage.TTYPE_DEFINITION__UNDERLYING_TYPE:
				return getUnderlyingType();
			case EdmPackage.TTYPE_DEFINITION__UNICODE:
				return isUnicode();
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
			case EdmPackage.TTYPE_DEFINITION__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case EdmPackage.TTYPE_DEFINITION__MAX_LENGTH:
				setMaxLength(newValue);
				return;
			case EdmPackage.TTYPE_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case EdmPackage.TTYPE_DEFINITION__PRECISION:
				setPrecision((BigInteger)newValue);
				return;
			case EdmPackage.TTYPE_DEFINITION__SCALE:
				setScale(newValue);
				return;
			case EdmPackage.TTYPE_DEFINITION__SRID:
				setSRID(newValue);
				return;
			case EdmPackage.TTYPE_DEFINITION__UNDERLYING_TYPE:
				setUnderlyingType(newValue);
				return;
			case EdmPackage.TTYPE_DEFINITION__UNICODE:
				setUnicode((Boolean)newValue);
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
			case EdmPackage.TTYPE_DEFINITION__ANNOTATION:
				getAnnotation().clear();
				return;
			case EdmPackage.TTYPE_DEFINITION__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case EdmPackage.TTYPE_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EdmPackage.TTYPE_DEFINITION__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case EdmPackage.TTYPE_DEFINITION__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case EdmPackage.TTYPE_DEFINITION__SRID:
				setSRID(SRID_EDEFAULT);
				return;
			case EdmPackage.TTYPE_DEFINITION__UNDERLYING_TYPE:
				setUnderlyingType(UNDERLYING_TYPE_EDEFAULT);
				return;
			case EdmPackage.TTYPE_DEFINITION__UNICODE:
				unsetUnicode();
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
			case EdmPackage.TTYPE_DEFINITION__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EdmPackage.TTYPE_DEFINITION__MAX_LENGTH:
				return MAX_LENGTH_EDEFAULT == null ? maxLength != null : !MAX_LENGTH_EDEFAULT.equals(maxLength);
			case EdmPackage.TTYPE_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EdmPackage.TTYPE_DEFINITION__PRECISION:
				return PRECISION_EDEFAULT == null ? precision != null : !PRECISION_EDEFAULT.equals(precision);
			case EdmPackage.TTYPE_DEFINITION__SCALE:
				return SCALE_EDEFAULT == null ? scale != null : !SCALE_EDEFAULT.equals(scale);
			case EdmPackage.TTYPE_DEFINITION__SRID:
				return SRID_EDEFAULT == null ? sRID != null : !SRID_EDEFAULT.equals(sRID);
			case EdmPackage.TTYPE_DEFINITION__UNDERLYING_TYPE:
				return UNDERLYING_TYPE_EDEFAULT == null ? underlyingType != null : !UNDERLYING_TYPE_EDEFAULT.equals(underlyingType);
			case EdmPackage.TTYPE_DEFINITION__UNICODE:
				return isSetUnicode();
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
		result.append(" (maxLength: ");
		result.append(maxLength);
		result.append(", name: ");
		result.append(name);
		result.append(", precision: ");
		result.append(precision);
		result.append(", scale: ");
		result.append(scale);
		result.append(", sRID: ");
		result.append(sRID);
		result.append(", underlyingType: ");
		result.append(underlyingType);
		result.append(", unicode: ");
		if (unicodeESet) result.append(unicode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TTypeDefinitionImpl
