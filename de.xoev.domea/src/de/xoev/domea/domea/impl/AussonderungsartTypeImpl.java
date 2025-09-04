/*
 */
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.AussonderungsartCodeType;
import de.xoev.domea.domea.AussonderungsartType;
import de.xoev.domea.domea.DomeaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aussonderungsart Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.AussonderungsartTypeImpl#getAussonderungsart <em>Aussonderungsart</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.AussonderungsartTypeImpl#getAussonderungsartKonfigurierbar <em>Aussonderungsart Konfigurierbar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AussonderungsartTypeImpl extends MinimalEObjectImpl.Container implements AussonderungsartType {
	/**
	 * The cached value of the '{@link #getAussonderungsart() <em>Aussonderungsart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAussonderungsart()
	 * @generated
	 * @ordered
	 */
	protected AussonderungsartCodeType aussonderungsart;

	/**
	 * The default value of the '{@link #getAussonderungsartKonfigurierbar() <em>Aussonderungsart Konfigurierbar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAussonderungsartKonfigurierbar()
	 * @generated
	 * @ordered
	 */
	protected static final String AUSSONDERUNGSART_KONFIGURIERBAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAussonderungsartKonfigurierbar() <em>Aussonderungsart Konfigurierbar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAussonderungsartKonfigurierbar()
	 * @generated
	 * @ordered
	 */
	protected String aussonderungsartKonfigurierbar = AUSSONDERUNGSART_KONFIGURIERBAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AussonderungsartTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.AUSSONDERUNGSART_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AussonderungsartCodeType getAussonderungsart() {
		return aussonderungsart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAussonderungsart(AussonderungsartCodeType newAussonderungsart, NotificationChain msgs) {
		AussonderungsartCodeType oldAussonderungsart = aussonderungsart;
		aussonderungsart = newAussonderungsart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.AUSSONDERUNGSART_TYPE__AUSSONDERUNGSART, oldAussonderungsart, newAussonderungsart);
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
	public void setAussonderungsart(AussonderungsartCodeType newAussonderungsart) {
		if (newAussonderungsart != aussonderungsart) {
			NotificationChain msgs = null;
			if (aussonderungsart != null)
				msgs = ((InternalEObject)aussonderungsart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AUSSONDERUNGSART_TYPE__AUSSONDERUNGSART, null, msgs);
			if (newAussonderungsart != null)
				msgs = ((InternalEObject)newAussonderungsart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.AUSSONDERUNGSART_TYPE__AUSSONDERUNGSART, null, msgs);
			msgs = basicSetAussonderungsart(newAussonderungsart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AUSSONDERUNGSART_TYPE__AUSSONDERUNGSART, newAussonderungsart, newAussonderungsart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAussonderungsartKonfigurierbar() {
		return aussonderungsartKonfigurierbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAussonderungsartKonfigurierbar(String newAussonderungsartKonfigurierbar) {
		String oldAussonderungsartKonfigurierbar = aussonderungsartKonfigurierbar;
		aussonderungsartKonfigurierbar = newAussonderungsartKonfigurierbar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.AUSSONDERUNGSART_TYPE__AUSSONDERUNGSART_KONFIGURIERBAR, oldAussonderungsartKonfigurierbar, aussonderungsartKonfigurierbar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.AUSSONDERUNGSART_TYPE__AUSSONDERUNGSART:
				return basicSetAussonderungsart(null, msgs);
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
			case DomeaPackage.AUSSONDERUNGSART_TYPE__AUSSONDERUNGSART:
				return getAussonderungsart();
			case DomeaPackage.AUSSONDERUNGSART_TYPE__AUSSONDERUNGSART_KONFIGURIERBAR:
				return getAussonderungsartKonfigurierbar();
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
			case DomeaPackage.AUSSONDERUNGSART_TYPE__AUSSONDERUNGSART:
				setAussonderungsart((AussonderungsartCodeType)newValue);
				return;
			case DomeaPackage.AUSSONDERUNGSART_TYPE__AUSSONDERUNGSART_KONFIGURIERBAR:
				setAussonderungsartKonfigurierbar((String)newValue);
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
			case DomeaPackage.AUSSONDERUNGSART_TYPE__AUSSONDERUNGSART:
				setAussonderungsart((AussonderungsartCodeType)null);
				return;
			case DomeaPackage.AUSSONDERUNGSART_TYPE__AUSSONDERUNGSART_KONFIGURIERBAR:
				setAussonderungsartKonfigurierbar(AUSSONDERUNGSART_KONFIGURIERBAR_EDEFAULT);
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
			case DomeaPackage.AUSSONDERUNGSART_TYPE__AUSSONDERUNGSART:
				return aussonderungsart != null;
			case DomeaPackage.AUSSONDERUNGSART_TYPE__AUSSONDERUNGSART_KONFIGURIERBAR:
				return AUSSONDERUNGSART_KONFIGURIERBAR_EDEFAULT == null ? aussonderungsartKonfigurierbar != null : !AUSSONDERUNGSART_KONFIGURIERBAR_EDEFAULT.equals(aussonderungsartKonfigurierbar);
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
		result.append(" (aussonderungsartKonfigurierbar: ");
		result.append(aussonderungsartKonfigurierbar);
		result.append(')');
		return result.toString();
	}

} //AussonderungsartTypeImpl
