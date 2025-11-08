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
package org.cyclonedx.schema.bom.impl;

import java.math.BigInteger;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.OccurrenceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occurrence Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.OccurrenceTypeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.OccurrenceTypeImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.OccurrenceTypeImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.OccurrenceTypeImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.OccurrenceTypeImpl#getAdditionalContext <em>Additional Context</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.OccurrenceTypeImpl#getBomRef <em>Bom Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OccurrenceTypeImpl extends MinimalEObjectImpl.Container implements OccurrenceType {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected BigInteger line = LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected BigInteger offset = OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected String symbol = SYMBOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalContext() <em>Additional Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalContext()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalContext() <em>Additional Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalContext()
	 * @generated
	 * @ordered
	 */
	protected String additionalContext = ADDITIONAL_CONTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBomRef() <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomRef()
	 * @generated
	 * @ordered
	 */
	protected static final String BOM_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBomRef() <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomRef()
	 * @generated
	 * @ordered
	 */
	protected String bomRef = BOM_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OccurrenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getOccurrenceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.OCCURRENCE_TYPE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLine(BigInteger newLine) {
		BigInteger oldLine = line;
		line = newLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.OCCURRENCE_TYPE__LINE, oldLine, line));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOffset(BigInteger newOffset) {
		BigInteger oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.OCCURRENCE_TYPE__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymbol(String newSymbol) {
		String oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.OCCURRENCE_TYPE__SYMBOL, oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalContext() {
		return additionalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalContext(String newAdditionalContext) {
		String oldAdditionalContext = additionalContext;
		additionalContext = newAdditionalContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.OCCURRENCE_TYPE__ADDITIONAL_CONTEXT, oldAdditionalContext, additionalContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBomRef() {
		return bomRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBomRef(String newBomRef) {
		String oldBomRef = bomRef;
		bomRef = newBomRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.OCCURRENCE_TYPE__BOM_REF, oldBomRef, bomRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BOMPackage.OCCURRENCE_TYPE__LOCATION:
				return getLocation();
			case BOMPackage.OCCURRENCE_TYPE__LINE:
				return getLine();
			case BOMPackage.OCCURRENCE_TYPE__OFFSET:
				return getOffset();
			case BOMPackage.OCCURRENCE_TYPE__SYMBOL:
				return getSymbol();
			case BOMPackage.OCCURRENCE_TYPE__ADDITIONAL_CONTEXT:
				return getAdditionalContext();
			case BOMPackage.OCCURRENCE_TYPE__BOM_REF:
				return getBomRef();
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
			case BOMPackage.OCCURRENCE_TYPE__LOCATION:
				setLocation((String)newValue);
				return;
			case BOMPackage.OCCURRENCE_TYPE__LINE:
				setLine((BigInteger)newValue);
				return;
			case BOMPackage.OCCURRENCE_TYPE__OFFSET:
				setOffset((BigInteger)newValue);
				return;
			case BOMPackage.OCCURRENCE_TYPE__SYMBOL:
				setSymbol((String)newValue);
				return;
			case BOMPackage.OCCURRENCE_TYPE__ADDITIONAL_CONTEXT:
				setAdditionalContext((String)newValue);
				return;
			case BOMPackage.OCCURRENCE_TYPE__BOM_REF:
				setBomRef((String)newValue);
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
			case BOMPackage.OCCURRENCE_TYPE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case BOMPackage.OCCURRENCE_TYPE__LINE:
				setLine(LINE_EDEFAULT);
				return;
			case BOMPackage.OCCURRENCE_TYPE__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case BOMPackage.OCCURRENCE_TYPE__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
				return;
			case BOMPackage.OCCURRENCE_TYPE__ADDITIONAL_CONTEXT:
				setAdditionalContext(ADDITIONAL_CONTEXT_EDEFAULT);
				return;
			case BOMPackage.OCCURRENCE_TYPE__BOM_REF:
				setBomRef(BOM_REF_EDEFAULT);
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
			case BOMPackage.OCCURRENCE_TYPE__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case BOMPackage.OCCURRENCE_TYPE__LINE:
				return LINE_EDEFAULT == null ? line != null : !LINE_EDEFAULT.equals(line);
			case BOMPackage.OCCURRENCE_TYPE__OFFSET:
				return OFFSET_EDEFAULT == null ? offset != null : !OFFSET_EDEFAULT.equals(offset);
			case BOMPackage.OCCURRENCE_TYPE__SYMBOL:
				return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
			case BOMPackage.OCCURRENCE_TYPE__ADDITIONAL_CONTEXT:
				return ADDITIONAL_CONTEXT_EDEFAULT == null ? additionalContext != null : !ADDITIONAL_CONTEXT_EDEFAULT.equals(additionalContext);
			case BOMPackage.OCCURRENCE_TYPE__BOM_REF:
				return BOM_REF_EDEFAULT == null ? bomRef != null : !BOM_REF_EDEFAULT.equals(bomRef);
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
		result.append(" (location: ");
		result.append(location);
		result.append(", line: ");
		result.append(line);
		result.append(", offset: ");
		result.append(offset);
		result.append(", symbol: ");
		result.append(symbol);
		result.append(", additionalContext: ");
		result.append(additionalContext);
		result.append(", bomRef: ");
		result.append(bomRef);
		result.append(')');
		return result.toString();
	}

} //OccurrenceTypeImpl
