/*
 */
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.AllgemeinerNameType;
import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.NameNatuerlichePersonType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Natuerliche Person Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.NameNatuerlichePersonTypeImpl#getAnrede <em>Anrede</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.NameNatuerlichePersonTypeImpl#getTitel <em>Titel</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.NameNatuerlichePersonTypeImpl#getFamilienname <em>Familienname</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.NameNatuerlichePersonTypeImpl#getVorname <em>Vorname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NameNatuerlichePersonTypeImpl extends MinimalEObjectImpl.Container implements NameNatuerlichePersonType {
	/**
	 * The default value of the '{@link #getAnrede() <em>Anrede</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnrede()
	 * @generated
	 * @ordered
	 */
	protected static final String ANREDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnrede() <em>Anrede</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnrede()
	 * @generated
	 * @ordered
	 */
	protected String anrede = ANREDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitel() <em>Titel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitel()
	 * @generated
	 * @ordered
	 */
	protected static final String TITEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitel() <em>Titel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitel()
	 * @generated
	 * @ordered
	 */
	protected String titel = TITEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFamilienname() <em>Familienname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilienname()
	 * @generated
	 * @ordered
	 */
	protected AllgemeinerNameType familienname;

	/**
	 * The cached value of the '{@link #getVorname() <em>Vorname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVorname()
	 * @generated
	 * @ordered
	 */
	protected AllgemeinerNameType vorname;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameNatuerlichePersonTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.NAME_NATUERLICHE_PERSON_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnrede() {
		return anrede;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnrede(String newAnrede) {
		String oldAnrede = anrede;
		anrede = newAnrede;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__ANREDE, oldAnrede, anrede));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitel() {
		return titel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitel(String newTitel) {
		String oldTitel = titel;
		titel = newTitel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__TITEL, oldTitel, titel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllgemeinerNameType getFamilienname() {
		return familienname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFamilienname(AllgemeinerNameType newFamilienname, NotificationChain msgs) {
		AllgemeinerNameType oldFamilienname = familienname;
		familienname = newFamilienname;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__FAMILIENNAME, oldFamilienname, newFamilienname);
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
	public void setFamilienname(AllgemeinerNameType newFamilienname) {
		if (newFamilienname != familienname) {
			NotificationChain msgs = null;
			if (familienname != null)
				msgs = ((InternalEObject)familienname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__FAMILIENNAME, null, msgs);
			if (newFamilienname != null)
				msgs = ((InternalEObject)newFamilienname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__FAMILIENNAME, null, msgs);
			msgs = basicSetFamilienname(newFamilienname, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__FAMILIENNAME, newFamilienname, newFamilienname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllgemeinerNameType getVorname() {
		return vorname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVorname(AllgemeinerNameType newVorname, NotificationChain msgs) {
		AllgemeinerNameType oldVorname = vorname;
		vorname = newVorname;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__VORNAME, oldVorname, newVorname);
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
	public void setVorname(AllgemeinerNameType newVorname) {
		if (newVorname != vorname) {
			NotificationChain msgs = null;
			if (vorname != null)
				msgs = ((InternalEObject)vorname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__VORNAME, null, msgs);
			if (newVorname != null)
				msgs = ((InternalEObject)newVorname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__VORNAME, null, msgs);
			msgs = basicSetVorname(newVorname, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__VORNAME, newVorname, newVorname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__FAMILIENNAME:
				return basicSetFamilienname(null, msgs);
			case DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__VORNAME:
				return basicSetVorname(null, msgs);
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
			case DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__ANREDE:
				return getAnrede();
			case DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__TITEL:
				return getTitel();
			case DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__FAMILIENNAME:
				return getFamilienname();
			case DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__VORNAME:
				return getVorname();
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
			case DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__ANREDE:
				setAnrede((String)newValue);
				return;
			case DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__TITEL:
				setTitel((String)newValue);
				return;
			case DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__FAMILIENNAME:
				setFamilienname((AllgemeinerNameType)newValue);
				return;
			case DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__VORNAME:
				setVorname((AllgemeinerNameType)newValue);
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
			case DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__ANREDE:
				setAnrede(ANREDE_EDEFAULT);
				return;
			case DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__TITEL:
				setTitel(TITEL_EDEFAULT);
				return;
			case DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__FAMILIENNAME:
				setFamilienname((AllgemeinerNameType)null);
				return;
			case DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__VORNAME:
				setVorname((AllgemeinerNameType)null);
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
			case DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__ANREDE:
				return ANREDE_EDEFAULT == null ? anrede != null : !ANREDE_EDEFAULT.equals(anrede);
			case DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__TITEL:
				return TITEL_EDEFAULT == null ? titel != null : !TITEL_EDEFAULT.equals(titel);
			case DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__FAMILIENNAME:
				return familienname != null;
			case DomeaPackage.NAME_NATUERLICHE_PERSON_TYPE__VORNAME:
				return vorname != null;
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
		result.append(" (anrede: ");
		result.append(anrede);
		result.append(", titel: ");
		result.append(titel);
		result.append(')');
		return result.toString();
	}

} //NameNatuerlichePersonTypeImpl
