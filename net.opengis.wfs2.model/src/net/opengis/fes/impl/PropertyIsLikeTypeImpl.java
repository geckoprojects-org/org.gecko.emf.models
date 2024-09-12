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
package net.opengis.fes.impl;

import net.opengis.fes.FESPackage;
import net.opengis.fes.PropertyIsLikeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Is Like Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.fes.impl.PropertyIsLikeTypeImpl#getExpressionGroup <em>Expression Group</em>}</li>
 *   <li>{@link net.opengis.fes.impl.PropertyIsLikeTypeImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link net.opengis.fes.impl.PropertyIsLikeTypeImpl#getEscapeChar <em>Escape Char</em>}</li>
 *   <li>{@link net.opengis.fes.impl.PropertyIsLikeTypeImpl#isMatchCase <em>Match Case</em>}</li>
 *   <li>{@link net.opengis.fes.impl.PropertyIsLikeTypeImpl#getSingleChar <em>Single Char</em>}</li>
 *   <li>{@link net.opengis.fes.impl.PropertyIsLikeTypeImpl#getWildCard <em>Wild Card</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyIsLikeTypeImpl extends ComparisonOpsTypeImpl implements PropertyIsLikeType {
	/**
	 * The cached value of the '{@link #getExpressionGroup() <em>Expression Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap expressionGroup;

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
		return FESPackage.Literals.PROPERTY_IS_LIKE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getExpressionGroup() {
		if (expressionGroup == null) {
			expressionGroup = new BasicFeatureMap(this, FESPackage.PROPERTY_IS_LIKE_TYPE__EXPRESSION_GROUP);
		}
		return expressionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getExpression() {
		return getExpressionGroup().list(FESPackage.Literals.PROPERTY_IS_LIKE_TYPE__EXPRESSION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, FESPackage.PROPERTY_IS_LIKE_TYPE__ESCAPE_CHAR, oldEscapeChar, escapeChar));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FESPackage.PROPERTY_IS_LIKE_TYPE__MATCH_CASE, oldMatchCase, matchCase, !oldMatchCaseESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FESPackage.PROPERTY_IS_LIKE_TYPE__MATCH_CASE, oldMatchCase, MATCH_CASE_EDEFAULT, oldMatchCaseESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FESPackage.PROPERTY_IS_LIKE_TYPE__SINGLE_CHAR, oldSingleChar, singleChar));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FESPackage.PROPERTY_IS_LIKE_TYPE__WILD_CARD, oldWildCard, wildCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FESPackage.PROPERTY_IS_LIKE_TYPE__EXPRESSION_GROUP:
				return ((InternalEList<?>)getExpressionGroup()).basicRemove(otherEnd, msgs);
			case FESPackage.PROPERTY_IS_LIKE_TYPE__EXPRESSION:
				return ((InternalEList<?>)getExpression()).basicRemove(otherEnd, msgs);
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
			case FESPackage.PROPERTY_IS_LIKE_TYPE__EXPRESSION_GROUP:
				if (coreType) return getExpressionGroup();
				return ((FeatureMap.Internal)getExpressionGroup()).getWrapper();
			case FESPackage.PROPERTY_IS_LIKE_TYPE__EXPRESSION:
				return getExpression();
			case FESPackage.PROPERTY_IS_LIKE_TYPE__ESCAPE_CHAR:
				return getEscapeChar();
			case FESPackage.PROPERTY_IS_LIKE_TYPE__MATCH_CASE:
				return isMatchCase();
			case FESPackage.PROPERTY_IS_LIKE_TYPE__SINGLE_CHAR:
				return getSingleChar();
			case FESPackage.PROPERTY_IS_LIKE_TYPE__WILD_CARD:
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
			case FESPackage.PROPERTY_IS_LIKE_TYPE__EXPRESSION_GROUP:
				((FeatureMap.Internal)getExpressionGroup()).set(newValue);
				return;
			case FESPackage.PROPERTY_IS_LIKE_TYPE__ESCAPE_CHAR:
				setEscapeChar((String)newValue);
				return;
			case FESPackage.PROPERTY_IS_LIKE_TYPE__MATCH_CASE:
				setMatchCase((Boolean)newValue);
				return;
			case FESPackage.PROPERTY_IS_LIKE_TYPE__SINGLE_CHAR:
				setSingleChar((String)newValue);
				return;
			case FESPackage.PROPERTY_IS_LIKE_TYPE__WILD_CARD:
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
			case FESPackage.PROPERTY_IS_LIKE_TYPE__EXPRESSION_GROUP:
				getExpressionGroup().clear();
				return;
			case FESPackage.PROPERTY_IS_LIKE_TYPE__ESCAPE_CHAR:
				setEscapeChar(ESCAPE_CHAR_EDEFAULT);
				return;
			case FESPackage.PROPERTY_IS_LIKE_TYPE__MATCH_CASE:
				unsetMatchCase();
				return;
			case FESPackage.PROPERTY_IS_LIKE_TYPE__SINGLE_CHAR:
				setSingleChar(SINGLE_CHAR_EDEFAULT);
				return;
			case FESPackage.PROPERTY_IS_LIKE_TYPE__WILD_CARD:
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
			case FESPackage.PROPERTY_IS_LIKE_TYPE__EXPRESSION_GROUP:
				return expressionGroup != null && !expressionGroup.isEmpty();
			case FESPackage.PROPERTY_IS_LIKE_TYPE__EXPRESSION:
				return !getExpression().isEmpty();
			case FESPackage.PROPERTY_IS_LIKE_TYPE__ESCAPE_CHAR:
				return ESCAPE_CHAR_EDEFAULT == null ? escapeChar != null : !ESCAPE_CHAR_EDEFAULT.equals(escapeChar);
			case FESPackage.PROPERTY_IS_LIKE_TYPE__MATCH_CASE:
				return isSetMatchCase();
			case FESPackage.PROPERTY_IS_LIKE_TYPE__SINGLE_CHAR:
				return SINGLE_CHAR_EDEFAULT == null ? singleChar != null : !SINGLE_CHAR_EDEFAULT.equals(singleChar);
			case FESPackage.PROPERTY_IS_LIKE_TYPE__WILD_CARD:
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
		result.append(" (expressionGroup: ");
		result.append(expressionGroup);
		result.append(", escapeChar: ");
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
