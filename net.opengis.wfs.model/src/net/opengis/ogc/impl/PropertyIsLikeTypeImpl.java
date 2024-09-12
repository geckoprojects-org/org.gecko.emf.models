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
package net.opengis.ogc.impl;

import net.opengis.ogc.LiteralType;
import net.opengis.ogc.OGCPackage;
import net.opengis.ogc.PropertyIsLikeType;
import net.opengis.ogc.PropertyNameType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Is Like Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.impl.PropertyIsLikeTypeImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.PropertyIsLikeTypeImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.PropertyIsLikeTypeImpl#getEscapeChar <em>Escape Char</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.PropertyIsLikeTypeImpl#isMatchCase <em>Match Case</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.PropertyIsLikeTypeImpl#getSingleChar <em>Single Char</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.PropertyIsLikeTypeImpl#getWildCard <em>Wild Card</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyIsLikeTypeImpl extends ComparisonOpsTypeImpl implements PropertyIsLikeType {
	/**
	 * The cached value of the '{@link #getPropertyName() <em>Property Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected PropertyNameType propertyName;

	/**
	 * The cached value of the '{@link #getLiteral() <em>Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected LiteralType literal;

	/**
	 * The default value of the '{@link #getEscapeChar() <em>Escape Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscapeChar()
	 * @generated
	 * @ordered
	 */
	protected static final String ESCAPE_CHAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEscapeChar() <em>Escape Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscapeChar()
	 * @generated
	 * @ordered
	 */
	protected String escapeChar = ESCAPE_CHAR_EDEFAULT;

	/**
	 * The default value of the '{@link #isMatchCase() <em>Match Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMatchCase()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MATCH_CASE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMatchCase() <em>Match Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMatchCase()
	 * @generated
	 * @ordered
	 */
	protected boolean matchCase = MATCH_CASE_EDEFAULT;

	/**
	 * This is true if the Match Case attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean matchCaseESet;

	/**
	 * The default value of the '{@link #getSingleChar() <em>Single Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleChar()
	 * @generated
	 * @ordered
	 */
	protected static final String SINGLE_CHAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSingleChar() <em>Single Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleChar()
	 * @generated
	 * @ordered
	 */
	protected String singleChar = SINGLE_CHAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getWildCard() <em>Wild Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWildCard()
	 * @generated
	 * @ordered
	 */
	protected static final String WILD_CARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWildCard() <em>Wild Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWildCard()
	 * @generated
	 * @ordered
	 */
	protected String wildCard = WILD_CARD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyIsLikeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OGCPackage.Literals.PROPERTY_IS_LIKE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyNameType getPropertyName() {
		return propertyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyName(PropertyNameType newPropertyName, NotificationChain msgs) {
		PropertyNameType oldPropertyName = propertyName;
		propertyName = newPropertyName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OGCPackage.PROPERTY_IS_LIKE_TYPE__PROPERTY_NAME, oldPropertyName, newPropertyName);
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
	public void setPropertyName(PropertyNameType newPropertyName) {
		if (newPropertyName != propertyName) {
			NotificationChain msgs = null;
			if (propertyName != null)
				msgs = ((InternalEObject)propertyName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OGCPackage.PROPERTY_IS_LIKE_TYPE__PROPERTY_NAME, null, msgs);
			if (newPropertyName != null)
				msgs = ((InternalEObject)newPropertyName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OGCPackage.PROPERTY_IS_LIKE_TYPE__PROPERTY_NAME, null, msgs);
			msgs = basicSetPropertyName(newPropertyName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCPackage.PROPERTY_IS_LIKE_TYPE__PROPERTY_NAME, newPropertyName, newPropertyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralType getLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLiteral(LiteralType newLiteral, NotificationChain msgs) {
		LiteralType oldLiteral = literal;
		literal = newLiteral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OGCPackage.PROPERTY_IS_LIKE_TYPE__LITERAL, oldLiteral, newLiteral);
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
	public void setLiteral(LiteralType newLiteral) {
		if (newLiteral != literal) {
			NotificationChain msgs = null;
			if (literal != null)
				msgs = ((InternalEObject)literal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OGCPackage.PROPERTY_IS_LIKE_TYPE__LITERAL, null, msgs);
			if (newLiteral != null)
				msgs = ((InternalEObject)newLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OGCPackage.PROPERTY_IS_LIKE_TYPE__LITERAL, null, msgs);
			msgs = basicSetLiteral(newLiteral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCPackage.PROPERTY_IS_LIKE_TYPE__LITERAL, newLiteral, newLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEscapeChar() {
		return escapeChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEscapeChar(String newEscapeChar) {
		String oldEscapeChar = escapeChar;
		escapeChar = newEscapeChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCPackage.PROPERTY_IS_LIKE_TYPE__ESCAPE_CHAR, oldEscapeChar, escapeChar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMatchCase() {
		return matchCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatchCase(boolean newMatchCase) {
		boolean oldMatchCase = matchCase;
		matchCase = newMatchCase;
		boolean oldMatchCaseESet = matchCaseESet;
		matchCaseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCPackage.PROPERTY_IS_LIKE_TYPE__MATCH_CASE, oldMatchCase, matchCase, !oldMatchCaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMatchCase() {
		boolean oldMatchCase = matchCase;
		boolean oldMatchCaseESet = matchCaseESet;
		matchCase = MATCH_CASE_EDEFAULT;
		matchCaseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OGCPackage.PROPERTY_IS_LIKE_TYPE__MATCH_CASE, oldMatchCase, MATCH_CASE_EDEFAULT, oldMatchCaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMatchCase() {
		return matchCaseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSingleChar() {
		return singleChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSingleChar(String newSingleChar) {
		String oldSingleChar = singleChar;
		singleChar = newSingleChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCPackage.PROPERTY_IS_LIKE_TYPE__SINGLE_CHAR, oldSingleChar, singleChar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWildCard() {
		return wildCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWildCard(String newWildCard) {
		String oldWildCard = wildCard;
		wildCard = newWildCard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OGCPackage.PROPERTY_IS_LIKE_TYPE__WILD_CARD, oldWildCard, wildCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OGCPackage.PROPERTY_IS_LIKE_TYPE__PROPERTY_NAME:
				return basicSetPropertyName(null, msgs);
			case OGCPackage.PROPERTY_IS_LIKE_TYPE__LITERAL:
				return basicSetLiteral(null, msgs);
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
			case OGCPackage.PROPERTY_IS_LIKE_TYPE__PROPERTY_NAME:
				return getPropertyName();
			case OGCPackage.PROPERTY_IS_LIKE_TYPE__LITERAL:
				return getLiteral();
			case OGCPackage.PROPERTY_IS_LIKE_TYPE__ESCAPE_CHAR:
				return getEscapeChar();
			case OGCPackage.PROPERTY_IS_LIKE_TYPE__MATCH_CASE:
				return isMatchCase();
			case OGCPackage.PROPERTY_IS_LIKE_TYPE__SINGLE_CHAR:
				return getSingleChar();
			case OGCPackage.PROPERTY_IS_LIKE_TYPE__WILD_CARD:
				return getWildCard();
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
			case OGCPackage.PROPERTY_IS_LIKE_TYPE__PROPERTY_NAME:
				setPropertyName((PropertyNameType)newValue);
				return;
			case OGCPackage.PROPERTY_IS_LIKE_TYPE__LITERAL:
				setLiteral((LiteralType)newValue);
				return;
			case OGCPackage.PROPERTY_IS_LIKE_TYPE__ESCAPE_CHAR:
				setEscapeChar((String)newValue);
				return;
			case OGCPackage.PROPERTY_IS_LIKE_TYPE__MATCH_CASE:
				setMatchCase((Boolean)newValue);
				return;
			case OGCPackage.PROPERTY_IS_LIKE_TYPE__SINGLE_CHAR:
				setSingleChar((String)newValue);
				return;
			case OGCPackage.PROPERTY_IS_LIKE_TYPE__WILD_CARD:
				setWildCard((String)newValue);
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
			case OGCPackage.PROPERTY_IS_LIKE_TYPE__PROPERTY_NAME:
				setPropertyName((PropertyNameType)null);
				return;
			case OGCPackage.PROPERTY_IS_LIKE_TYPE__LITERAL:
				setLiteral((LiteralType)null);
				return;
			case OGCPackage.PROPERTY_IS_LIKE_TYPE__ESCAPE_CHAR:
				setEscapeChar(ESCAPE_CHAR_EDEFAULT);
				return;
			case OGCPackage.PROPERTY_IS_LIKE_TYPE__MATCH_CASE:
				unsetMatchCase();
				return;
			case OGCPackage.PROPERTY_IS_LIKE_TYPE__SINGLE_CHAR:
				setSingleChar(SINGLE_CHAR_EDEFAULT);
				return;
			case OGCPackage.PROPERTY_IS_LIKE_TYPE__WILD_CARD:
				setWildCard(WILD_CARD_EDEFAULT);
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
			case OGCPackage.PROPERTY_IS_LIKE_TYPE__PROPERTY_NAME:
				return propertyName != null;
			case OGCPackage.PROPERTY_IS_LIKE_TYPE__LITERAL:
				return literal != null;
			case OGCPackage.PROPERTY_IS_LIKE_TYPE__ESCAPE_CHAR:
				return ESCAPE_CHAR_EDEFAULT == null ? escapeChar != null : !ESCAPE_CHAR_EDEFAULT.equals(escapeChar);
			case OGCPackage.PROPERTY_IS_LIKE_TYPE__MATCH_CASE:
				return isSetMatchCase();
			case OGCPackage.PROPERTY_IS_LIKE_TYPE__SINGLE_CHAR:
				return SINGLE_CHAR_EDEFAULT == null ? singleChar != null : !SINGLE_CHAR_EDEFAULT.equals(singleChar);
			case OGCPackage.PROPERTY_IS_LIKE_TYPE__WILD_CARD:
				return WILD_CARD_EDEFAULT == null ? wildCard != null : !WILD_CARD_EDEFAULT.equals(wildCard);
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
		result.append(" (escapeChar: ");
		result.append(escapeChar);
		result.append(", matchCase: ");
		if (matchCaseESet) result.append(matchCase); else result.append("<unset>");
		result.append(", singleChar: ");
		result.append(singleChar);
		result.append(", wildCard: ");
		result.append(wildCard);
		result.append(')');
		return result.toString();
	}

} //PropertyIsLikeTypeImpl
