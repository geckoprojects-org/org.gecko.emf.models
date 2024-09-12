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
package org.isotc211._2005.gmd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.DatePropertyType;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.CICitationType;
import org.isotc211._2005.gmd.CIDatePropertyType;
import org.isotc211._2005.gmd.CIPresentationFormCodePropertyType;
import org.isotc211._2005.gmd.CIResponsiblePartyPropertyType;
import org.isotc211._2005.gmd.CISeriesPropertyType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDIdentifierPropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CI Citation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.CICitationTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CICitationTypeImpl#getAlternateTitle <em>Alternate Title</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CICitationTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CICitationTypeImpl#getEdition <em>Edition</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CICitationTypeImpl#getEditionDate <em>Edition Date</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CICitationTypeImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CICitationTypeImpl#getCitedResponsibleParty <em>Cited Responsible Party</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CICitationTypeImpl#getPresentationForm <em>Presentation Form</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CICitationTypeImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CICitationTypeImpl#getOtherCitationDetails <em>Other Citation Details</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CICitationTypeImpl#getCollectiveTitle <em>Collective Title</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CICitationTypeImpl#getISBN <em>ISBN</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CICitationTypeImpl#getISSN <em>ISSN</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CICitationTypeImpl extends AbstractObjectTypeImpl implements CICitationType {
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType title;

	/**
	 * The cached value of the '{@link #getAlternateTitle() <em>Alternate Title</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternateTitle()
	 * @generated
	 * @ordered
	 */
	protected EList<CharacterStringPropertyType> alternateTitle;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected EList<CIDatePropertyType> date;

	/**
	 * The cached value of the '{@link #getEdition() <em>Edition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdition()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType edition;

	/**
	 * The cached value of the '{@link #getEditionDate() <em>Edition Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditionDate()
	 * @generated
	 * @ordered
	 */
	protected DatePropertyType editionDate;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<MDIdentifierPropertyType> identifier;

	/**
	 * The cached value of the '{@link #getCitedResponsibleParty() <em>Cited Responsible Party</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitedResponsibleParty()
	 * @generated
	 * @ordered
	 */
	protected EList<CIResponsiblePartyPropertyType> citedResponsibleParty;

	/**
	 * The cached value of the '{@link #getPresentationForm() <em>Presentation Form</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationForm()
	 * @generated
	 * @ordered
	 */
	protected EList<CIPresentationFormCodePropertyType> presentationForm;

	/**
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected CISeriesPropertyType series;

	/**
	 * The cached value of the '{@link #getOtherCitationDetails() <em>Other Citation Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCitationDetails()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType otherCitationDetails;

	/**
	 * The cached value of the '{@link #getCollectiveTitle() <em>Collective Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectiveTitle()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType collectiveTitle;

	/**
	 * The cached value of the '{@link #getISBN() <em>ISBN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISBN()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType iSBN;

	/**
	 * The cached value of the '{@link #getISSN() <em>ISSN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISSN()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType iSSN;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CICitationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getCICitationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(CharacterStringPropertyType newTitle, NotificationChain msgs) {
		CharacterStringPropertyType oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_CITATION_TYPE__TITLE, oldTitle, newTitle);
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
	public void setTitle(CharacterStringPropertyType newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_CITATION_TYPE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_CITATION_TYPE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_CITATION_TYPE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CharacterStringPropertyType> getAlternateTitle() {
		if (alternateTitle == null) {
			alternateTitle = new EObjectContainmentEList<CharacterStringPropertyType>(CharacterStringPropertyType.class, this, GMDPackage.CI_CITATION_TYPE__ALTERNATE_TITLE);
		}
		return alternateTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CIDatePropertyType> getDate() {
		if (date == null) {
			date = new EObjectContainmentEList<CIDatePropertyType>(CIDatePropertyType.class, this, GMDPackage.CI_CITATION_TYPE__DATE);
		}
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getEdition() {
		return edition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEdition(CharacterStringPropertyType newEdition, NotificationChain msgs) {
		CharacterStringPropertyType oldEdition = edition;
		edition = newEdition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_CITATION_TYPE__EDITION, oldEdition, newEdition);
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
	public void setEdition(CharacterStringPropertyType newEdition) {
		if (newEdition != edition) {
			NotificationChain msgs = null;
			if (edition != null)
				msgs = ((InternalEObject)edition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_CITATION_TYPE__EDITION, null, msgs);
			if (newEdition != null)
				msgs = ((InternalEObject)newEdition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_CITATION_TYPE__EDITION, null, msgs);
			msgs = basicSetEdition(newEdition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_CITATION_TYPE__EDITION, newEdition, newEdition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatePropertyType getEditionDate() {
		return editionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEditionDate(DatePropertyType newEditionDate, NotificationChain msgs) {
		DatePropertyType oldEditionDate = editionDate;
		editionDate = newEditionDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_CITATION_TYPE__EDITION_DATE, oldEditionDate, newEditionDate);
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
	public void setEditionDate(DatePropertyType newEditionDate) {
		if (newEditionDate != editionDate) {
			NotificationChain msgs = null;
			if (editionDate != null)
				msgs = ((InternalEObject)editionDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_CITATION_TYPE__EDITION_DATE, null, msgs);
			if (newEditionDate != null)
				msgs = ((InternalEObject)newEditionDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_CITATION_TYPE__EDITION_DATE, null, msgs);
			msgs = basicSetEditionDate(newEditionDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_CITATION_TYPE__EDITION_DATE, newEditionDate, newEditionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDIdentifierPropertyType> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<MDIdentifierPropertyType>(MDIdentifierPropertyType.class, this, GMDPackage.CI_CITATION_TYPE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CIResponsiblePartyPropertyType> getCitedResponsibleParty() {
		if (citedResponsibleParty == null) {
			citedResponsibleParty = new EObjectContainmentEList<CIResponsiblePartyPropertyType>(CIResponsiblePartyPropertyType.class, this, GMDPackage.CI_CITATION_TYPE__CITED_RESPONSIBLE_PARTY);
		}
		return citedResponsibleParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CIPresentationFormCodePropertyType> getPresentationForm() {
		if (presentationForm == null) {
			presentationForm = new EObjectContainmentEList<CIPresentationFormCodePropertyType>(CIPresentationFormCodePropertyType.class, this, GMDPackage.CI_CITATION_TYPE__PRESENTATION_FORM);
		}
		return presentationForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CISeriesPropertyType getSeries() {
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeries(CISeriesPropertyType newSeries, NotificationChain msgs) {
		CISeriesPropertyType oldSeries = series;
		series = newSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_CITATION_TYPE__SERIES, oldSeries, newSeries);
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
	public void setSeries(CISeriesPropertyType newSeries) {
		if (newSeries != series) {
			NotificationChain msgs = null;
			if (series != null)
				msgs = ((InternalEObject)series).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_CITATION_TYPE__SERIES, null, msgs);
			if (newSeries != null)
				msgs = ((InternalEObject)newSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_CITATION_TYPE__SERIES, null, msgs);
			msgs = basicSetSeries(newSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_CITATION_TYPE__SERIES, newSeries, newSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getOtherCitationDetails() {
		return otherCitationDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOtherCitationDetails(CharacterStringPropertyType newOtherCitationDetails, NotificationChain msgs) {
		CharacterStringPropertyType oldOtherCitationDetails = otherCitationDetails;
		otherCitationDetails = newOtherCitationDetails;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_CITATION_TYPE__OTHER_CITATION_DETAILS, oldOtherCitationDetails, newOtherCitationDetails);
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
	public void setOtherCitationDetails(CharacterStringPropertyType newOtherCitationDetails) {
		if (newOtherCitationDetails != otherCitationDetails) {
			NotificationChain msgs = null;
			if (otherCitationDetails != null)
				msgs = ((InternalEObject)otherCitationDetails).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_CITATION_TYPE__OTHER_CITATION_DETAILS, null, msgs);
			if (newOtherCitationDetails != null)
				msgs = ((InternalEObject)newOtherCitationDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_CITATION_TYPE__OTHER_CITATION_DETAILS, null, msgs);
			msgs = basicSetOtherCitationDetails(newOtherCitationDetails, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_CITATION_TYPE__OTHER_CITATION_DETAILS, newOtherCitationDetails, newOtherCitationDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getCollectiveTitle() {
		return collectiveTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollectiveTitle(CharacterStringPropertyType newCollectiveTitle, NotificationChain msgs) {
		CharacterStringPropertyType oldCollectiveTitle = collectiveTitle;
		collectiveTitle = newCollectiveTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_CITATION_TYPE__COLLECTIVE_TITLE, oldCollectiveTitle, newCollectiveTitle);
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
	public void setCollectiveTitle(CharacterStringPropertyType newCollectiveTitle) {
		if (newCollectiveTitle != collectiveTitle) {
			NotificationChain msgs = null;
			if (collectiveTitle != null)
				msgs = ((InternalEObject)collectiveTitle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_CITATION_TYPE__COLLECTIVE_TITLE, null, msgs);
			if (newCollectiveTitle != null)
				msgs = ((InternalEObject)newCollectiveTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_CITATION_TYPE__COLLECTIVE_TITLE, null, msgs);
			msgs = basicSetCollectiveTitle(newCollectiveTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_CITATION_TYPE__COLLECTIVE_TITLE, newCollectiveTitle, newCollectiveTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getISBN() {
		return iSBN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetISBN(CharacterStringPropertyType newISBN, NotificationChain msgs) {
		CharacterStringPropertyType oldISBN = iSBN;
		iSBN = newISBN;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_CITATION_TYPE__ISBN, oldISBN, newISBN);
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
	public void setISBN(CharacterStringPropertyType newISBN) {
		if (newISBN != iSBN) {
			NotificationChain msgs = null;
			if (iSBN != null)
				msgs = ((InternalEObject)iSBN).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_CITATION_TYPE__ISBN, null, msgs);
			if (newISBN != null)
				msgs = ((InternalEObject)newISBN).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_CITATION_TYPE__ISBN, null, msgs);
			msgs = basicSetISBN(newISBN, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_CITATION_TYPE__ISBN, newISBN, newISBN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getISSN() {
		return iSSN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetISSN(CharacterStringPropertyType newISSN, NotificationChain msgs) {
		CharacterStringPropertyType oldISSN = iSSN;
		iSSN = newISSN;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.CI_CITATION_TYPE__ISSN, oldISSN, newISSN);
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
	public void setISSN(CharacterStringPropertyType newISSN) {
		if (newISSN != iSSN) {
			NotificationChain msgs = null;
			if (iSSN != null)
				msgs = ((InternalEObject)iSSN).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_CITATION_TYPE__ISSN, null, msgs);
			if (newISSN != null)
				msgs = ((InternalEObject)newISSN).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.CI_CITATION_TYPE__ISSN, null, msgs);
			msgs = basicSetISSN(newISSN, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.CI_CITATION_TYPE__ISSN, newISSN, newISSN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.CI_CITATION_TYPE__TITLE:
				return basicSetTitle(null, msgs);
			case GMDPackage.CI_CITATION_TYPE__ALTERNATE_TITLE:
				return ((InternalEList<?>)getAlternateTitle()).basicRemove(otherEnd, msgs);
			case GMDPackage.CI_CITATION_TYPE__DATE:
				return ((InternalEList<?>)getDate()).basicRemove(otherEnd, msgs);
			case GMDPackage.CI_CITATION_TYPE__EDITION:
				return basicSetEdition(null, msgs);
			case GMDPackage.CI_CITATION_TYPE__EDITION_DATE:
				return basicSetEditionDate(null, msgs);
			case GMDPackage.CI_CITATION_TYPE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case GMDPackage.CI_CITATION_TYPE__CITED_RESPONSIBLE_PARTY:
				return ((InternalEList<?>)getCitedResponsibleParty()).basicRemove(otherEnd, msgs);
			case GMDPackage.CI_CITATION_TYPE__PRESENTATION_FORM:
				return ((InternalEList<?>)getPresentationForm()).basicRemove(otherEnd, msgs);
			case GMDPackage.CI_CITATION_TYPE__SERIES:
				return basicSetSeries(null, msgs);
			case GMDPackage.CI_CITATION_TYPE__OTHER_CITATION_DETAILS:
				return basicSetOtherCitationDetails(null, msgs);
			case GMDPackage.CI_CITATION_TYPE__COLLECTIVE_TITLE:
				return basicSetCollectiveTitle(null, msgs);
			case GMDPackage.CI_CITATION_TYPE__ISBN:
				return basicSetISBN(null, msgs);
			case GMDPackage.CI_CITATION_TYPE__ISSN:
				return basicSetISSN(null, msgs);
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
			case GMDPackage.CI_CITATION_TYPE__TITLE:
				return getTitle();
			case GMDPackage.CI_CITATION_TYPE__ALTERNATE_TITLE:
				return getAlternateTitle();
			case GMDPackage.CI_CITATION_TYPE__DATE:
				return getDate();
			case GMDPackage.CI_CITATION_TYPE__EDITION:
				return getEdition();
			case GMDPackage.CI_CITATION_TYPE__EDITION_DATE:
				return getEditionDate();
			case GMDPackage.CI_CITATION_TYPE__IDENTIFIER:
				return getIdentifier();
			case GMDPackage.CI_CITATION_TYPE__CITED_RESPONSIBLE_PARTY:
				return getCitedResponsibleParty();
			case GMDPackage.CI_CITATION_TYPE__PRESENTATION_FORM:
				return getPresentationForm();
			case GMDPackage.CI_CITATION_TYPE__SERIES:
				return getSeries();
			case GMDPackage.CI_CITATION_TYPE__OTHER_CITATION_DETAILS:
				return getOtherCitationDetails();
			case GMDPackage.CI_CITATION_TYPE__COLLECTIVE_TITLE:
				return getCollectiveTitle();
			case GMDPackage.CI_CITATION_TYPE__ISBN:
				return getISBN();
			case GMDPackage.CI_CITATION_TYPE__ISSN:
				return getISSN();
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
			case GMDPackage.CI_CITATION_TYPE__TITLE:
				setTitle((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.CI_CITATION_TYPE__ALTERNATE_TITLE:
				getAlternateTitle().clear();
				getAlternateTitle().addAll((Collection<? extends CharacterStringPropertyType>)newValue);
				return;
			case GMDPackage.CI_CITATION_TYPE__DATE:
				getDate().clear();
				getDate().addAll((Collection<? extends CIDatePropertyType>)newValue);
				return;
			case GMDPackage.CI_CITATION_TYPE__EDITION:
				setEdition((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.CI_CITATION_TYPE__EDITION_DATE:
				setEditionDate((DatePropertyType)newValue);
				return;
			case GMDPackage.CI_CITATION_TYPE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends MDIdentifierPropertyType>)newValue);
				return;
			case GMDPackage.CI_CITATION_TYPE__CITED_RESPONSIBLE_PARTY:
				getCitedResponsibleParty().clear();
				getCitedResponsibleParty().addAll((Collection<? extends CIResponsiblePartyPropertyType>)newValue);
				return;
			case GMDPackage.CI_CITATION_TYPE__PRESENTATION_FORM:
				getPresentationForm().clear();
				getPresentationForm().addAll((Collection<? extends CIPresentationFormCodePropertyType>)newValue);
				return;
			case GMDPackage.CI_CITATION_TYPE__SERIES:
				setSeries((CISeriesPropertyType)newValue);
				return;
			case GMDPackage.CI_CITATION_TYPE__OTHER_CITATION_DETAILS:
				setOtherCitationDetails((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.CI_CITATION_TYPE__COLLECTIVE_TITLE:
				setCollectiveTitle((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.CI_CITATION_TYPE__ISBN:
				setISBN((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.CI_CITATION_TYPE__ISSN:
				setISSN((CharacterStringPropertyType)newValue);
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
			case GMDPackage.CI_CITATION_TYPE__TITLE:
				setTitle((CharacterStringPropertyType)null);
				return;
			case GMDPackage.CI_CITATION_TYPE__ALTERNATE_TITLE:
				getAlternateTitle().clear();
				return;
			case GMDPackage.CI_CITATION_TYPE__DATE:
				getDate().clear();
				return;
			case GMDPackage.CI_CITATION_TYPE__EDITION:
				setEdition((CharacterStringPropertyType)null);
				return;
			case GMDPackage.CI_CITATION_TYPE__EDITION_DATE:
				setEditionDate((DatePropertyType)null);
				return;
			case GMDPackage.CI_CITATION_TYPE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case GMDPackage.CI_CITATION_TYPE__CITED_RESPONSIBLE_PARTY:
				getCitedResponsibleParty().clear();
				return;
			case GMDPackage.CI_CITATION_TYPE__PRESENTATION_FORM:
				getPresentationForm().clear();
				return;
			case GMDPackage.CI_CITATION_TYPE__SERIES:
				setSeries((CISeriesPropertyType)null);
				return;
			case GMDPackage.CI_CITATION_TYPE__OTHER_CITATION_DETAILS:
				setOtherCitationDetails((CharacterStringPropertyType)null);
				return;
			case GMDPackage.CI_CITATION_TYPE__COLLECTIVE_TITLE:
				setCollectiveTitle((CharacterStringPropertyType)null);
				return;
			case GMDPackage.CI_CITATION_TYPE__ISBN:
				setISBN((CharacterStringPropertyType)null);
				return;
			case GMDPackage.CI_CITATION_TYPE__ISSN:
				setISSN((CharacterStringPropertyType)null);
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
			case GMDPackage.CI_CITATION_TYPE__TITLE:
				return title != null;
			case GMDPackage.CI_CITATION_TYPE__ALTERNATE_TITLE:
				return alternateTitle != null && !alternateTitle.isEmpty();
			case GMDPackage.CI_CITATION_TYPE__DATE:
				return date != null && !date.isEmpty();
			case GMDPackage.CI_CITATION_TYPE__EDITION:
				return edition != null;
			case GMDPackage.CI_CITATION_TYPE__EDITION_DATE:
				return editionDate != null;
			case GMDPackage.CI_CITATION_TYPE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case GMDPackage.CI_CITATION_TYPE__CITED_RESPONSIBLE_PARTY:
				return citedResponsibleParty != null && !citedResponsibleParty.isEmpty();
			case GMDPackage.CI_CITATION_TYPE__PRESENTATION_FORM:
				return presentationForm != null && !presentationForm.isEmpty();
			case GMDPackage.CI_CITATION_TYPE__SERIES:
				return series != null;
			case GMDPackage.CI_CITATION_TYPE__OTHER_CITATION_DETAILS:
				return otherCitationDetails != null;
			case GMDPackage.CI_CITATION_TYPE__COLLECTIVE_TITLE:
				return collectiveTitle != null;
			case GMDPackage.CI_CITATION_TYPE__ISBN:
				return iSBN != null;
			case GMDPackage.CI_CITATION_TYPE__ISSN:
				return iSSN != null;
		}
		return super.eIsSet(featureID);
	}

} //CICitationTypeImpl
