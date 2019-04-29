/**
 * Generated with Acceleo
 */
package org.wso2.developerstudio.eclipse.gmf.esb.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import org.wso2.developerstudio.eclipse.gmf.esb.ChildEndpoint;
import org.wso2.developerstudio.eclipse.gmf.esb.ChildEndpointType;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;

import org.wso2.developerstudio.eclipse.gmf.esb.parts.ChildEndpointPropertiesEditionPart;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.EsbViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ChildEndpointPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for staticReference EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings staticReferenceSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ChildEndpointPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject childEndpoint, String editing_mode) {
		super(editingContext, childEndpoint, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EsbViewsRepository.class;
		partKey = EsbViewsRepository.ChildEndpoint.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final ChildEndpoint childEndpoint = (ChildEndpoint)elt;
			final ChildEndpointPropertiesEditionPart basePart = (ChildEndpointPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(EsbViewsRepository.ChildEndpoint.Properties.childEndpointType)) {
				basePart.initChildEndpointType(EEFUtils.choiceOfValues(childEndpoint, EsbPackage.eINSTANCE.getChildEndpoint_ChildEndpointType()), childEndpoint.getChildEndpointType());
			}
			if (isAccessible(EsbViewsRepository.ChildEndpoint.Properties.inlineEndpoint))
				basePart.setInlineEndpoint(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, childEndpoint.getInlineEndpoint()));
			
			if (isAccessible(EsbViewsRepository.ChildEndpoint.Properties.staticReference)) {
				// init part
				staticReferenceSettings = new EObjectFlatComboSettings(childEndpoint, EsbPackage.eINSTANCE.getChildEndpoint_StaticReference());
				basePart.initStaticReference(staticReferenceSettings);
				// set the button mode
				basePart.setStaticReferenceButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			
			if (isAccessible(EsbViewsRepository.ChildEndpoint.Properties.staticReference)) {
				basePart.addFilterToStaticReference(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof RegistryKeyProperty); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for staticReference
				// End of user code
			}
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}






	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == EsbViewsRepository.ChildEndpoint.Properties.childEndpointType) {
			return EsbPackage.eINSTANCE.getChildEndpoint_ChildEndpointType();
		}
		if (editorKey == EsbViewsRepository.ChildEndpoint.Properties.inlineEndpoint) {
			return EsbPackage.eINSTANCE.getChildEndpoint_InlineEndpoint();
		}
		if (editorKey == EsbViewsRepository.ChildEndpoint.Properties.staticReference) {
			return EsbPackage.eINSTANCE.getChildEndpoint_StaticReference();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ChildEndpoint childEndpoint = (ChildEndpoint)semanticObject;
		if (EsbViewsRepository.ChildEndpoint.Properties.childEndpointType == event.getAffectedEditor()) {
			childEndpoint.setChildEndpointType((ChildEndpointType)event.getNewValue());
		}
		if (EsbViewsRepository.ChildEndpoint.Properties.inlineEndpoint == event.getAffectedEditor()) {
			childEndpoint.setInlineEndpoint((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (EsbViewsRepository.ChildEndpoint.Properties.staticReference == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				staticReferenceSettings.setToReference((RegistryKeyProperty)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				RegistryKeyProperty eObject = EsbFactory.eINSTANCE.createRegistryKeyProperty();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				staticReferenceSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ChildEndpointPropertiesEditionPart basePart = (ChildEndpointPropertiesEditionPart)editingPart;
			if (EsbPackage.eINSTANCE.getChildEndpoint_ChildEndpointType().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(EsbViewsRepository.ChildEndpoint.Properties.childEndpointType))
				basePart.setChildEndpointType((ChildEndpointType)msg.getNewValue());
			
			if (EsbPackage.eINSTANCE.getChildEndpoint_InlineEndpoint().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EsbViewsRepository.ChildEndpoint.Properties.inlineEndpoint)) {
				if (msg.getNewValue() != null) {
					basePart.setInlineEndpoint(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setInlineEndpoint("");
				}
			}
			if (EsbPackage.eINSTANCE.getChildEndpoint_StaticReference().equals(msg.getFeature()) && basePart != null && isAccessible(EsbViewsRepository.ChildEndpoint.Properties.staticReference))
				basePart.setStaticReference((EObject)msg.getNewValue());
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			EsbPackage.eINSTANCE.getChildEndpoint_ChildEndpointType(),
			EsbPackage.eINSTANCE.getChildEndpoint_InlineEndpoint(),
			EsbPackage.eINSTANCE.getChildEndpoint_StaticReference()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (EsbViewsRepository.ChildEndpoint.Properties.childEndpointType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EsbPackage.eINSTANCE.getChildEndpoint_ChildEndpointType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EsbPackage.eINSTANCE.getChildEndpoint_ChildEndpointType().getEAttributeType(), newValue);
				}
				if (EsbViewsRepository.ChildEndpoint.Properties.inlineEndpoint == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EsbPackage.eINSTANCE.getChildEndpoint_InlineEndpoint().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EsbPackage.eINSTANCE.getChildEndpoint_InlineEndpoint().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
