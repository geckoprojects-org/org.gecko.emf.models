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
import org.open.oasis.docs.odata.ns.edm.TProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TProperty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyImpl#isNullable <em>Nullable</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyImpl#getSRID <em>SRID</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyImpl#isUnicode <em>Unicode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TPropertyImpl extends MinimalEObjectImpl.Container implements TProperty {
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
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

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
	 * The default value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NULLABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected boolean nullable = NULLABLE_EDEFAULT;

	/**
	 * This is true if the Nullable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nullableESet;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Object TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Object type = TYPE_EDEFAULT;

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
	protected TPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmPackage.eINSTANCE.getTProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectContainmentEList<AnnotationType>(AnnotationType.class, this, EdmPackage.TPROPERTY__ANNOTATION);
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY__DEFAULT_VALUE, oldDefaultValue, defaultValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY__MAX_LENGTH, oldMaxLength, maxLength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNullable() {
		return nullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNullable(boolean newNullable) {
		boolean oldNullable = nullable;
		nullable = newNullable;
		boolean oldNullableESet = nullableESet;
		nullableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY__NULLABLE, oldNullable, nullable, !oldNullableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNullable() {
		boolean oldNullable = nullable;
		boolean oldNullableESet = nullableESet;
		nullable = NULLABLE_EDEFAULT;
		nullableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdmPackage.TPROPERTY__NULLABLE, oldNullable, NULLABLE_EDEFAULT, oldNullableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNullable() {
		return nullableESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY__PRECISION, oldPrecision, precision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY__SCALE, oldScale, scale));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY__SRID, oldSRID, sRID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Object newType) {
		Object oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TPROPERTY__UNICODE, oldUnicode, unicode, !oldUnicodeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdmPackage.TPROPERTY__UNICODE, oldUnicode, UNICODE_EDEFAULT, oldUnicodeESet));
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
			case EdmPackage.TPROPERTY__ANNOTATION:
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
			case EdmPackage.TPROPERTY__ANNOTATION:
				return getAnnotation();
			case EdmPackage.TPROPERTY__DEFAULT_VALUE:
				return getDefaultValue();
			case EdmPackage.TPROPERTY__MAX_LENGTH:
				return getMaxLength();
			case EdmPackage.TPROPERTY__NAME:
				return getName();
			case EdmPackage.TPROPERTY__NULLABLE:
				return isNullable();
			case EdmPackage.TPROPERTY__PRECISION:
				return getPrecision();
			case EdmPackage.TPROPERTY__SCALE:
				return getScale();
			case EdmPackage.TPROPERTY__SRID:
				return getSRID();
			case EdmPackage.TPROPERTY__TYPE:
				return getType();
			case EdmPackage.TPROPERTY__UNICODE:
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
			case EdmPackage.TPROPERTY__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case EdmPackage.TPROPERTY__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case EdmPackage.TPROPERTY__MAX_LENGTH:
				setMaxLength(newValue);
				return;
			case EdmPackage.TPROPERTY__NAME:
				setName((String)newValue);
				return;
			case EdmPackage.TPROPERTY__NULLABLE:
				setNullable((Boolean)newValue);
				return;
			case EdmPackage.TPROPERTY__PRECISION:
				setPrecision((BigInteger)newValue);
				return;
			case EdmPackage.TPROPERTY__SCALE:
				setScale(newValue);
				return;
			case EdmPackage.TPROPERTY__SRID:
				setSRID(newValue);
				return;
			case EdmPackage.TPROPERTY__TYPE:
				setType(newValue);
				return;
			case EdmPackage.TPROPERTY__UNICODE:
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
			case EdmPackage.TPROPERTY__ANNOTATION:
				getAnnotation().clear();
				return;
			case EdmPackage.TPROPERTY__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case EdmPackage.TPROPERTY__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case EdmPackage.TPROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EdmPackage.TPROPERTY__NULLABLE:
				unsetNullable();
				return;
			case EdmPackage.TPROPERTY__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case EdmPackage.TPROPERTY__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case EdmPackage.TPROPERTY__SRID:
				setSRID(SRID_EDEFAULT);
				return;
			case EdmPackage.TPROPERTY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case EdmPackage.TPROPERTY__UNICODE:
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
			case EdmPackage.TPROPERTY__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EdmPackage.TPROPERTY__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case EdmPackage.TPROPERTY__MAX_LENGTH:
				return MAX_LENGTH_EDEFAULT == null ? maxLength != null : !MAX_LENGTH_EDEFAULT.equals(maxLength);
			case EdmPackage.TPROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EdmPackage.TPROPERTY__NULLABLE:
				return isSetNullable();
			case EdmPackage.TPROPERTY__PRECISION:
				return PRECISION_EDEFAULT == null ? precision != null : !PRECISION_EDEFAULT.equals(precision);
			case EdmPackage.TPROPERTY__SCALE:
				return SCALE_EDEFAULT == null ? scale != null : !SCALE_EDEFAULT.equals(scale);
			case EdmPackage.TPROPERTY__SRID:
				return SRID_EDEFAULT == null ? sRID != null : !SRID_EDEFAULT.equals(sRID);
			case EdmPackage.TPROPERTY__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case EdmPackage.TPROPERTY__UNICODE:
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
		result.append(" (defaultValue: ");
		result.append(defaultValue);
		result.append(", maxLength: ");
		result.append(maxLength);
		result.append(", name: ");
		result.append(name);
		result.append(", nullable: ");
		if (nullableESet) result.append(nullable); else result.append("<unset>");
		result.append(", precision: ");
		result.append(precision);
		result.append(", scale: ");
		result.append(scale);
		result.append(", sRID: ");
		result.append(sRID);
		result.append(", type: ");
		result.append(type);
		result.append(", unicode: ");
		if (unicodeESet) result.append(unicode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TPropertyImpl
